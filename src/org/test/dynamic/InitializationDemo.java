package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InitializationDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		long a,b;
		float c,d;
		String name;
		char g;
		System.out.println("Enter Your Name:");
		name=ob.readLine();
		
		System.out.println("Enter value of c:");
		c=Float.parseFloat(ob.readLine());
		
		System.out.println("Enter value of d:");
		d=Float.parseFloat(ob.readLine());
		
		System.out.println(c+d);
		
		System.err.println("This is an Example of Error Stream");
		
		System.out.println(name);
		System.out.println();
		
		

	}

}
