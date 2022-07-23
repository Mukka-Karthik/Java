package Abstract;

import java.io.*;
import java.util.*;


public class algorithm {
	
	public static void main(String args[])
	{
		
		// finding the sum on n natural numbers 
	       
	       ArrayList<Integer> aArrayList = new ArrayList<Integer>();
	       
	       Scanner giveSome_customScan = new Scanner(System.in);
	       
	       System.out.println("Enter some random number for calculation");
	       
	       int giveSomeRandomNumber = giveSome_customScan.nextInt(); 
	       
	       for(int i =1 ; i <= giveSomeRandomNumber ; i++)
	       {
	        aArrayList.add(i);
	           
	       }
	           int Count = 0;

	       
	       for(int iLocal : aArrayList)
	       {
	           System.out.println(iLocal);
	           
	           Count+=iLocal;
	       }

	        System.out.println("Sum of first natural numbers after calculation =  " + Count);       
	        
	                System.out.println("Average of given  natural numbers = " +  Count/giveSomeRandomNumber);
	                
	                giveSome_customScan.close();
	       
	}

}




       
       
       
       
       
       
