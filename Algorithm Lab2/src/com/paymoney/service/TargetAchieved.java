package com.paymoney.service;
import java.util.*;

/*
 * this is the service code for Lab 2 – Algorithms Problem Statement 
 * the method isTargetAchieved will print whether the target is achievable.
 * */

public class TargetAchieved {
	public static void isTargetAchieved(int []transactions,int numTargets)
	{	Scanner sc=new Scanner(System.in);
	while(numTargets>0)
	{
		System.out.println("Enter the value of target ");
		int target=sc.nextInt();
		int sum=0,j=0,flag=0;
		for(int i:transactions)
		{	j+=1;
		sum+=i;//keep on adding the elements of the array till we achieve the target
		if(sum>=target)
		{	//target achieved
			System.out.println("Target achieved after "+j+" transactions ");
			flag=1;
			break;
		}
		}
		if(flag==0)//target not achieved
			System.out.println(" Given target is not achieved ");
		numTargets--;
	}
	sc.close();
	}
}
