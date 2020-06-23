package com.providencepolicedata.main;

import com.providencepolicedata.hibernate.Hibernate;

public class Main {
	public static void main(String[] args) throws Exception{
//		ParseJson.ParseCaseJson();
//		System.out.println("Data has been parsed.");
		Hibernate.main(args);
	}

}