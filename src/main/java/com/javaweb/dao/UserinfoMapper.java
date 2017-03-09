package com.javaweb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.javaweb.entity.Userinfo;
import com.javaweb.views.UserSector;
import com.javaweb.views.UserView;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
    List<UserSector> selectAllUserByDep();
    
    /**
     * 查询所有的用户
     * @param status
     * @return
     */
    List<UserView> selectAllUsers(@Param("status")String status,@Param("key")String key);
    
}