package com.app.dao;

import java.util.List;

import com.app.model.UsersRegistration;

public interface IUsersRegisterDao {
	public Integer saveUsers(UsersRegistration usersRegistration);
	public void updateUsers(UsersRegistration usersRegistration);
	public void deleteUsers(Integer usrid);
	public UsersRegistration getUsersById(Integer usrid);
	public List<UsersRegistration> getAllUsers();

}
