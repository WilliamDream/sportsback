package com.letansuo.sportsback.biz.club.mapper;

import com.letansuo.sportsback.biz.club.model.Coach;
import java.util.List;

public interface CoachMapper {
    int insert(Coach record);

    List<Coach> selectAll();
}