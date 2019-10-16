package com.demo;

import java.util.ArrayList;

public class ListDemo {

	//type safety
	ArrayList<String> list=new ArrayList();
	
	public void addObjects()
	{
		list.add("Smart Phone");
		list.add("Smart TV");
		list.add("Smart Gear");
	}
	public int findLength()
	{
		return list.size();
	}
	public boolean contains(String str)
	{
		return list.contains(str);
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public static void main(String[] args) {
		
	}

}
