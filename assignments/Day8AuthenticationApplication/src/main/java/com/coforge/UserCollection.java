package com.coforge;

import java.util.ArrayList;

public class UserCollection {
	public static ArrayList<User> user_collection = new ArrayList<User>();
	
	public static void add_to_db(User u) throws Exception {
		for(User temp: user_collection) {
			if(temp.getUsername().equals(u.getUsername())) {
				System.out.println("User with username exist");
				throw new Exception("Username Already Exists");
			}
		}
		
		user_collection.add(u);
	}
	
	public static User fetch_from_db(String username) {		
		for(User u: user_collection) {
			if(u.getUsername().equals(username)) {
				return u;
			}
		}
		
		return null;
	}
}
