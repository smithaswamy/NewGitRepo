package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Properties p = new Properties();
		p.load(new FileInputStream("my.properties"));
		String name = p.getProperty("OS");
		System.out.println("Name:\t" + name);

		// store

		/*
		 * p.setProperty("SPACE", "100GB"); p.store(new
		 * FileOutputStream("my.properties"), "New");
		 */

		// p.elements() => Values
		// p.keys()=> keys
		System.out.println("=============================");
		Enumeration edata = p.elements();
		while (edata.hasMoreElements()) {
			System.out.println("" + edata.nextElement());
		}
	}

}
