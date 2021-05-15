package com.ld.dao;

import com.ld.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from user where id=#{id}")
    public User getUser(int id);
}
