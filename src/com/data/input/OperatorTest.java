package com.data.input;

public class OperatorTest {

	public static void main(String[] args) {
		
		
		int a=56,b=35,c=76;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		a+=5;
		System.out.println(a);
		a-=5;
		System.out.println(a);
		a+=5;
		System.out.println(a);
		a*=5;
		System.out.println(a);
		a/=5;
		System.out.println(a);
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a>>2);
		System.out.println(a<<2);
		
		
		a=10;
		b=17;
		System.out.println(++a + --b - b-- + ++a * b--);
		
		
	int y=(20>30)?20:30;
	System.out.println(y);
	
	String s=(20<30)?"java":"c++";
	System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
