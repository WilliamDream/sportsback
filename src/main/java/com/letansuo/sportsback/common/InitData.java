package com.letansuo.sportsback.common;

import com.letansuo.sportsback.biz.club.mapper.ClubMapper;
import com.letansuo.sportsback.biz.club.model.Club;
import com.letansuo.sportsback.biz.sports.mapper.SportClassifyMapper;
import com.letansuo.sportsback.biz.sports.model.SportClassify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/10/24 21:49
 */

@Component
public  class  InitData {

    public static Map<Integer,String> SprotClassifyMap = new HashMap<>();

    public static Map<Integer,String> ClubMap = new HashMap<>();

    public static Map<Integer,String> PriceStrategyMap = new HashMap<>();

    @Autowired
    private SportClassifyMapper sportClassifyMapper;

    @Autowired
    private ClubMapper clubMapper;

    @PostConstruct
    private void initData(){
        initSportClassify();
        initClub();
        initPriceStrategy();
    }

    private void initSportClassify(){
        List<SportClassify> list = sportClassifyMapper.selectSportClassify(new SportClassify());
        for(SportClassify bean : list){
            SprotClassifyMap.put(bean.getTypeId(),bean.getTypeName());
        }
    }

    private void initClub(){
        List<Club> list = clubMapper.selectClub(new Club());
        for(Club bean : list){
            ClubMap.put(bean.getClubid(),bean.getClubname());
        }
    }

    private void initPriceStrategy(){
        PriceStrategyMap.put(0,"展示原价");
        PriceStrategyMap.put(1,"展示原价和特价");
        PriceStrategyMap.put(2,"展示原价和底价");
        PriceStrategyMap.put(3,"展示原价和团购价");
        PriceStrategyMap.put(4,"展示原价、特价和团购价");

    }

}
