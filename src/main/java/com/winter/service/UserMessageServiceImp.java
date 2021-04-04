package com.winter.service;

import com.winter.mapper.UserMessageMapper;
import com.winter.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageServiceImp implements UserMessageService {
    @Autowired
    private UserMessageMapper userMessageMapper;
    @Override
    public int deleteByPrimaryKey(String accound) {
        return 0;
    }

    @Override
    public int insert(UserMessage record) {
        return 0;
    }

    @Override
    public int insertSelective(UserMessage record) {
        return 0;
    }

    @Override
    public UserMessage selectByPrimaryKey(String accound) {
        return userMessageMapper.selectByPrimaryKey( accound );
    }

    @Override
    public int updateByPrimaryKeySelective(UserMessage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserMessage record) {
        return 0;
    }
}
