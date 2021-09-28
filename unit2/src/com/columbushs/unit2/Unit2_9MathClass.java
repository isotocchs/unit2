package com.columbushs.unit2;

import static java.lang.Math.*;

public class Unit2_9MathClass {
	
	public void mathClassTesting() {
		
		//math class methods are static. No need to create object to use them.
		
		//abs gets the absolute value
		int absolute1 = Math.abs(-57);
		//System.out.println(absolute1);
		
		double absolute2 = Math.abs(absolute1*-4);
		//System.out.println(absolute2);
		
		//pow = value of first parameter raised to the second parameter
		double powers = Math.pow(4, 2);
		//System.out.println(powers);
		
		//sqrt = gets the square root
		double squareRoot = Math.sqrt(57);
		//System.out.println(squareRoot);
		
		//random = get random number from 0.0 to 1.0
		//double randomNum = Math.random();
		//System.out.println(randomNum);
		//multiply by 10 and make an int to get random number from 1-10
		double rand = Math.random();
		double rand10 = (int)rand*10;
		double rand100 = (int)rand*100;
		System.out.println(rand);
		System.out.println(rand10);
		System.out.println(rand100);
		//same thing for 100, etc
		double rand100Other = Math.random()*100;
		System.out.println((int)rand100Other);
		
		
		//importing stuff, why? so you don't have to use the prefix all the time.
		//import static java.lang.Math.*;
		
	double absolute3 = abs(absolute1*-12);
		//System.out.println(absolute3);
		
		double randomNum2 = random();
		//System.out.println(randomNum2);
		
		double squareRoot2 = sqrt(64);
		//System.out.println(squareRoot);
		
	}

}
