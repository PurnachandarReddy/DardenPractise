package com.practise;

public class Dummy {
	
	static void min(int arr[]){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		}  
 
		public static void main(String args[]){  
			int a[]={33,3,4,5,-1};
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			System.out.println("the lowest number in the array is: ");
				min(a);//passing array to method  
			}  
	}

