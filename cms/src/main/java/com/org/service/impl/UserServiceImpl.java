package com.org.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.org.dao.IUserDao;
import com.org.domain.User;
import com.org.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource
	private IUserDao userDao;

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(id);
	}

}
