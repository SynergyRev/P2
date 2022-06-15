package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.utilities.HibernateUtil;

import models.Users;
import repository.UserDao;

public class Launcher {
public static void main(String[] args) {
	
	try(Session ses = HibernateUtil.getSession()){
		System.out.println("Connection Successful");
}
	catch (HibernateException e) {
	System.out.println("Connection Failed");
		e.printStackTrace();
	}
	

UserDao ud = new UserDao();



//Users u1 = new Users("Momo", "Traore", "MomoT1", "password","momotraore@yahoo.com", "New York");
//Users u2 = new Users("Aly", "Traore", "AlyT1", "password","alytraore@yahoo.com", "New York");
////Users u3 = new Users();
////Users u4 = new Users();
//
//
//
//ud.insertUser(u1);
//ud.insertUser(u2);
////ud.insertUser(u3);
////ud.insertUser(u4);
////
////	
}
}
