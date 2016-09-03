package com.snnu.edu.serviceInterface.impl;

import java.util.List;

import com.snnu.edu.dao.BaseDao;
import com.snnu.edu.entity.Users;
import com.snnu.edu.serviceInterface.UserService;

@SuppressWarnings("unchecked")
public class UserServiceImpl implements UserService {

	public boolean saveOrUpdateUsers(Users user) {
		try {
			BaseDao.saveOrUpdateObj(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean delUserInfo(Users user) {
		try {
			BaseDao.deleteObj(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Users getUserById(int id) {
		return (Users) BaseDao.getObject("from Users where id='" + id + "'");
	}

	public List<Users> findWithPage() {
		return (List<Users>) BaseDao.findWithPage("from Users ");
	}

}
