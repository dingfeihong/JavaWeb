package com.newWebApp.service;

import com.newWebApp.mapper.UserMapper;
import com.newWebApp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

   // @Autowired
  //  private CacheManager cacheManager;
    @Cacheable(value = "selectUser",key = "#userId")
    public User selectUser(int userId){

//        Cache cache = cacheManager.getCache("content");
//        User user = (User) cache.get(userId);
//        if(user != null)
//            return user;
        User user = this.userMapper.selectByPrimaryKey(userId);
        System.out.println("------------------->query user id=" + userId);
        return user;
    }

}