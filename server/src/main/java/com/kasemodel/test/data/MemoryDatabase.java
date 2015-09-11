package com.kasemodel.test.data;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Singleton;
import com.kasemodel.test.vo.User;

@Singleton
public class MemoryDatabase {

	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void addUsers(User user) {
		getUsers().add(user);
	}

}
