package com.letansuo.sportsback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class SportsWebApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(SportsWebApplication.class, args);
  }
}