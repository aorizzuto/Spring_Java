package com.example.udemycourse.user;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount =6;
	
	static {
		users.add(new User(1,"Ale", new Date()));
		users.add(new User(2,"Seba", new Date()));
		users.add(new User(3,"Eip", new Date()));
		users.add(new User(4,"Cia", new Date()));
		users.add(new User(5,"Diana", new Date()));
		users.add(new User(6,"Omi", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if (user.getId()==null) {
			user.setId(usersCount++);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
}
