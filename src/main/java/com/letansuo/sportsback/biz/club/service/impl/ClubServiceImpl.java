package com.letansuo.sportsback.biz.club.service.impl;

import com.github.pagehelper.PageInfo;
import com.letansuo.sportsback.biz.classes.mapper.ClassesMapper;
import com.letansuo.sportsback.biz.club.mapper.ClubMapper;
import com.letansuo.sportsback.biz.club.model.Club;
import com.letansuo.sportsback.biz.club.service.ClubService;
import com.letansuo.sportsback.error.errorCode.GlobalErrorCode;
import com.letansuo.sportsback.error.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/9/21 16:12
 */
@Service
public class ClubServiceImpl implements ClubService{

    @Autowired
    private ClubMapper mapper;

    @Override
    public Club selectByPrimaryKey(Integer classid) {
        return mapper.selectByPrimaryKey(classid);
    }

    @Override
    public PageInfo<Club> selectClub(Club club) {
        List list = null;
        try {
            list = this.mapper.selectClub(club);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(GlobalErrorCode.QUERY_EXCE);
        }
        return new PageInfo(list);
    }

    @Override
    public int insert(Club club) {
        return mapper.insert(club);
    }

    @Override
    public int updateByPrimaryKey(Club club) {
        return mapper.updateByPrimaryKey(club);
    }

    @Override
    public int deleteByPrimaryKey(Integer clubid) {
        return mapper.deleteByPrimaryKey(clubid);
    }
}
