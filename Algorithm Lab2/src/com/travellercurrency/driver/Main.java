package com.travellercurrency.driver;
import java.util.*;
import com.travellercurrency.service.*;


/*
 * this is the driver code for Problem 2 of Lab 2 – Algorithms Problem Statement 
 * 
 * */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		int size=sc.nextInt();
		System.out.println("Enter the currency denominations value ");
		int []currency=new int[size];
		int x;
		for(int i=0;i<size;i++)
		{	x=sc.nextInt();
		while(x<=0)
		{	//no form of currency can have 0 denomination. Hence we will keep asking for a valid denomination till the user provides grater than 0
			System.out.println("Notes of denomination 0 is not allowed");
			x=sc.nextInt();
		}
		currency[i]=x;
		}
		currencyDenominations.sort(currency,0,size-1);//sorting in descending order using merge sort
		System.out.println("Enter the amount you want to pay ");
		int amount=sc.nextInt();
		if(amount<=0)//if we want to pay 0 there there is only one way i.e.,we don't pay anything
			System.out.println("this is not a valid denomination");
		else
			currencyDenominations.paymentApproach(currency,amount);//this method will give us the payment approach
		sc.close();
	}

}
