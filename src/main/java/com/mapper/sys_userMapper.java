package com.mapper;

import com.model.sys_user;
import org.springframework.stereotype.Repository;

@Repository
public interface sys_userMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(sys_user record);

    int insertSelective(sys_user record);

    sys_user selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(sys_user record);

    int updateByPrimaryKey(sys_user record);
}