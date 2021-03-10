package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUsersRegisterDao;
import com.app.model.UsersRegistration;
import com.app.service.IUsersRegisterService;

@Service
public class UsersRegisterServiceImpl implements IUsersRegisterService {

	@Autowired
	private IUsersRegisterDao dao;
	@Transactional
	@Override
	public Integer saveUsers(UsersRegistration usersRegistration) {

		return dao.saveUsers(usersRegistration);
	}

	@Override
	public void updateUsers(UsersRegistration usersRegistration) {
		// TODO Auto-generated method stub

	}

	@Transactional
	@Override
	public void deleteUsers(Integer usrid) {
        
		dao.deleteUsers(usrid);
	}

	@Override
	public UsersRegistration getUsersById(Integer usrid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<UsersRegistration> getAllUsers() {
                  
		return dao.getAllUsers();
	}

}
