package com.letansuo.sportsback.utils;

import com.letansuo.sportsback.error.errorCode.GlobalErrorCode;
import com.letansuo.sportsback.error.exception.BizException;
import java.io.PrintStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AESUntil
{
  private static final String AESKEY = "b!@&%s$~*e)_d+.s";
  private static final Logger logger = LoggerFactory.getLogger(AESUntil.class);

  public static String aesEncode(String password)
  {
    String result = null;
    try
    {
      byte[] passwordByte = password.getBytes("GBK");
      result = parseByte2HexStr(aesEncrypt(passwordByte, "b!@&%s$~*e)_d+.s".getBytes("GBK")));
    } catch (Exception e) {
      logger.error("AES加密发生错误");
      throw new BizException(GlobalErrorCode.ENCODE_ERROR);
    }
    byte[] passwordByte;
    return result;
  }

  public static String aesDecode(String password)
  {
    String res = null;
    byte[] content = parseHexStr2Byte(password);
    try
    {
      byte[] decodeBytes = aesDecrypt(content, "b!@&%s$~*e)_d+.s".getBytes("GBK"));
      res = new String(decodeBytes, "GBK");
    } catch (Exception e) {
      logger.error("AES解密发生错误");
      throw new BizException(GlobalErrorCode.DECODE_ERROR);
    }

    return res;
  }

  private static byte[] aesEncrypt(byte[] content, byte[] aesKey)
    throws Exception
  {
    SecretKeySpec key = new SecretKeySpec(aesKey, "AES");

    Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

    byte[] byteContent = content;

    int len = byteContent.length;

    int l = len % 16 > 0 ? 16 - len % 16 : 0;

    byte[] tmpContent = new byte[byteContent.length + l];

    System.arraycopy(byteContent, 0, tmpContent, 0, len);

    cipher.init(1, key);

    byte[] result = cipher.doFinal(tmpContent);

    return result;
  }

  private static byte[] aesDecrypt(byte[] content, byte[] aesKey)
    throws Exception
  {
    if ((aesKey == null) || (aesKey.length != 16)) {
      return null;
    }

    SecretKeySpec skp = new SecretKeySpec(aesKey, "AES");

    Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

    cipher.init(2, skp);

    byte[] original = cipher.doFinal(content);
    int i = 0;

    for (i = 0; i < original.length; i++)
    {
      if (original[i] == 0)
      {
        break;
      }
    }
    byte[] bbb = new byte[i];

    System.arraycopy(original, 0, bbb, 0, i);

    return bbb;
  }

  public static String parseByte2HexStr(byte[] buf)
  {
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < buf.length; i++) {
      String hex = Integer.toHexString(buf[i] & 0xFF);

      if (hex.length() == 1) {
        hex = '0' + hex;
      }

      sb.append(hex);
    }

    return sb.toString();
  }

  public static byte[] parseHexStr2Byte(String hexStr)
  {
    if (hexStr.length() < 1)
      return null;
    byte[] result = new byte[hexStr.length() / 2];
    for (int i = 0; i < hexStr.length() / 2; i++) {
      int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
      int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
      result[i] = (byte)(high * 16 + low);
    }
    return result;
  }

  public static void main(String[] args) throws Exception
  {
    String password = "{\"datatype\":1,\"startlastupdatetm\":\"2018-03-12 09:49:47.000\",\"pagesize\":10,\"index\":1}";
    System.out.println("加密前的密码：" + password);
    String encPassword = aesEncode(password);
    System.out.println("加密后的密码：" + encPassword);
  }
}