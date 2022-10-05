package com.AbcLoan.app.model;

import java.util.Random;

public class cibil 
{
	public static void main(String[] args) 
	{
		int min = 600;
		int max = 850;
		 
		Random random = new Random();
		int CibilScore = random.nextInt(max-min)+min;
		
		System.out.println(CibilScore);
		
	}

}
