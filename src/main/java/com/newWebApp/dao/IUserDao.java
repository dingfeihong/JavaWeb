package com.newWebApp.dao;

import com.newWebApp.pojo.User;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserDao {

    User selectByPrimaryKey(Integer id);
}