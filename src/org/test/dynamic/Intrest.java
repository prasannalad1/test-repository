package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intrest {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		double c,f;
		  InputStreamReader in=new InputStreamReader(System.in);
		  BufferedReader ob=new BufferedReader(in);
		  

		  
		  System.out.println("Enter the farenite:");
		  f=Double.parseDouble(ob.readLine());
		  

		  
	        c=(f-32*5)/9;
		  
		  System.out.println("Temp in celsius ="+c);

	}

}
