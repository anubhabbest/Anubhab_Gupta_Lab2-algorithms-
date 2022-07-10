package com.travellercurrency.service;
import java.util.*;
public class currencyDenominations {
	public static HashMap<Integer,Integer> hm=new HashMap<>();//this hashmap will contain the currency denomination as key and the number of notes of each currency as value
	static void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	public static void paymentApproach(int []currency,int amount)
	{
		int note=-1;
		if(amount==0)
		{	//since the amount is now 0, we will print our result
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for(int i:currency)
			{
				if(hm.containsKey(i))
					System.out.println(i+":"+hm.get(i));
			}
			return;
		}
		for(int i=0;i<currency.length;i++)
		{	
			if(currency[i]<=amount)
			{
				note=currency[i];
				break;

			}
		}
		if(note==-1)
		{//amount cannot be given with the highest denomination
			System.out.println("exact amount cannot be given with the highest denomination");
			return;
		}
		int notes=amount/note;
		amount-=notes*note;
		hm.put(note, notes);
		paymentApproach(currency,amount);//recursively calling itself with decreased amount value
	}

}
