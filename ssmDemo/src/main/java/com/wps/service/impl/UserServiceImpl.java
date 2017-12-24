package com.wps.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wps.dao.UserDao;
import com.wps.model.User;
import com.wps.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
    private UserDao userDao;
    @Override  
    public User findUser() {  
        return userDao.findUser();
    }
}
