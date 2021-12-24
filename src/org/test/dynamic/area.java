package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class area {

	public static void main(String[] args)throws NumberFormatException, IOException  {
		double pi=3.14,r, area,peri;
		  InputStreamReader in=new InputStreamReader(System.in);
		  BufferedReader ob=new BufferedReader(in);
		  

		  
		  System.out.println("Enter the radius:");
		  r=Double.parseDouble(ob.readLine());
		  

		  
	        area=pi*r*r;
	        peri=2*pi*r;
		  
		  System.out.println("area of circle ="+area);
		  System.out.println("Perimeter ="+peri);
		  


	}

}
