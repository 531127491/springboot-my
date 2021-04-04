package com.winter.service;

import com.winter.model.UserMessage;

public interface UserMessageService {
    int deleteByPrimaryKey(String accound);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(String accound);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}
