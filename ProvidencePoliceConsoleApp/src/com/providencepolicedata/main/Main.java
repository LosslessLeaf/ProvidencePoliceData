package com.providencepolicedata.main;

import com.providencepolicedata.hibernate.QueryCaseData;

public class Main {
	public static void main(String[] args) throws Exception{
//		ParseJson.ParseCaseJson();
//		System.out.println("Data has been parsed.");
		QueryCaseData.main(args);
	}

}