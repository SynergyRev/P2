package com.revature;

import models.Users;
import repository.UserDao;

public class Launcher {
public static void main(String[] args) {
	

UserDao ud = new UserDao();



Users u1 = new Users("Momo", "Traore", "MomoT1", "password","momotraore@yahoo.com", "New York");
Users u2 = new Users("Aly", "Traore", "AlyT1", "password","alytraore@yahoo.com", "New York");
//Users u3 = new Users();
//Users u4 = new Users();



ud.insertUser(u1);
ud.insertUser(u2);
//ud.insertUser(u3);
//ud.insertUser(u4);
//
//	
}
}
