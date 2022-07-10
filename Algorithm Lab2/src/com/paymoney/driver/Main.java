package com.paymoney.driver;
import com.paymoney.service.*;

/*
 * this is the driver code for problem 1 of Lab 2 – Algorithms Problem Statement 
 * */

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		int size=sc.nextInt();
		int transactions[]=new int[size];
		System.out.println("Enter the values of array ");
		for(int i=0;i<size;i++)
		{
			transactions[i]=sc.nextInt();//input array elements
		}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int numTargets=sc.nextInt();
		TargetAchieved.isTargetAchieved(transactions,numTargets);
		sc.close();
	}

}
