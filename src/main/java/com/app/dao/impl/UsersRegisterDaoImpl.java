package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUsersRegisterDao;
import com.app.model.UsersRegistration;

@Repository
public class UsersRegisterDaoImpl implements IUsersRegisterDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUsers(UsersRegistration usersRegistration) {

		return (Integer) ht.save(usersRegistration);
	}

	@Override
	public void updateUsers(UsersRegistration usersRegistration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUsers(Integer usrid) {

		ht.delete(new UsersRegistration(usrid));
	}

	@Override
	public UsersRegistration getUsersById(Integer usrid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersRegistration> getAllUsers() {
            
		return ht.loadAll(UsersRegistration.class);
	}

}
