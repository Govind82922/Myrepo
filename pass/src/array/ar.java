package array;
import java.util.*;
public class ar {
	
//    static void arrayages() {
//    	Scanner sc=new Scanner(System.in);
//    	int ages[] = new int[5];
//    	float []weight = new float[5];
//    	String [] name = new String[5];
//    	
//    	for(int i=0; i<5; i++) {
//    		System.out.println("enter the number");
//    		ages [i] = sc.nextInt();
//    		System.out.println(ages[i]);
//    	}
	
//*****************************************************
//	static void sumarr() {
//	int [] arr = {2,3,4,5,6,7,8};
//	int sum=0;
//	for(int i=0; i<arr.length; i++) {
//	   sum= sum + arr[i];	
//	}	
//	System.out.println(sum);
//    }
//*********************************************************************************
	
//	static void max() {
//		int arr[] = {2,4,78,3,7,9};
//		int ans = 0;
//		
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>ans) {
//				ans = arr[i];
//			}
//		}
//		
//		System.out.println(ans);
//	}
//****************************************************
//	static void sum3() {
//	int []arr = {2,3,4,5,6,7,};
//	int sum=0;
//	for(int i=0; i<arr.length; i++) {
//		sum = arr[i]+sum;
//	}
//	System.out.println(sum);
//	}
	
//*****************************************************	
	
//	static void search() {
//	  int arr[] = {2,4,6,8,3,7};
//	  int x = 8;
//	  int ans = -1;
//	  for(int i=0; i<arr.length; i++) {
//		  if(arr[i]==x) {
//			 ans=i;
//		  }
//	  }
//	  System.out.println("found " + x + " index"+ans);
//	}
	
//*******************************************************	
	
//	static void maxi() {
//		int arr[] = {56,34,23,67,89,80,};
//		int x = 89;
//		int index=-1;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==x) {
//			 index=i;
//			}
//		}
//		System.out.println("found " +x+" at index "+index);
//	}
	
	//******************************************************
	
	static void searched() {
		int arr[] = {2,3,4,5,6,7,8,9};
		int a = 5;
		int index=-1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==5) {
				index =i;
			}
		}
		
		System.out.println("found "+a+" at the index " +index);
		
	}
	
    public static void main(String args[]) {
    	//arrayages();
    	//sumarr();
    	//max();
    	//search();
    	//sum3();
    	//maxi();
    	searched();
    }
	
    
    
    
    
    
}
