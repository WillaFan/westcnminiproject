package com.fdmgroup.iwish.dao;

import java.util.List;

import com.fdmgroup.iwish.model.User;

public interface IUserDao extends IStorage<User>, IEditable<User>, IRemovable<User> {
	public User findByUsername(String username);
	public List<User> findByFirstname(String firstname);
}
