package com.winter.mapper;

import com.winter.model.UserMessage;

public interface UserMessageMapper {
    int deleteByPrimaryKey(String accound);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(String accound);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}