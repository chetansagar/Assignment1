/*
 * Software Engineering Assignment - Fermat's theorem - Near Miss
 * File that holds the program: Nearest Miss
 * 
 * Programmers Names: 
 * 1. Chetan Sagar Mogili
 * 		email address: ChetanSagarMogili@lewisu.edu
 * 2. Sumanth Goud Rangu
 * 		email address: SumanthGoudRangu@lewisu.edu
 * 
 * Course: FA23-CPSC-60500-001
 * 
 * September 24, 2023
 * 
 * In this program our task was to compute every possible combination of x and y in the range of K, and try to find out the near miss, relative miss and smallest miss from all the combination.
 * user inputs are for K which is range, and n which is power. Then Applied nested for loop with respect to x and y, and it starts from lower limit and goes until the upper limit, in this way 
 * every possible combination of x and y will be computed. We performed the computation x^n + y^n and then take the nth root of its value and we get the value for z. Then we find the near miss
 * by subtracting z from x^n + y^n, and subtracting x^n + y^n from (z+1)^n. Then according to given formula in assignment's instruction we find the relative miss and in the end by comparing the
 * values of near miss we find the Smallest miss.
 * 
 * 
 * 
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class NearestMiss {
	public static void main(String[] args) 
	{ 
		//Variables required for equation
		long x=0;
	    long y = 0;
	    long z = 0;
	    int k = 0;
	    int n = 0;
	    
	    Scanner userinput = new Scanner(System.in);
	    
	    
	  //loop to take the user input again and again to get the correct values from the user. here user input will be for n
	    while(n<3 || n>11)
	    {
	    	System.out.println("Enter the value for n (n>2 and n<12) = ");
		    n = userinput.nextInt();
	    }
	    
	    //loop to take the user input again and again to get the correct values from the user. here user input will be for k
	    while(k<10)
	    {
	    	System.out.println("Enter the Value for K (K>=10) = ");
		    k = userinput.nextInt();
	    }
	    
	    
    	
	    double smallrelativedifference = 100000000000000.00; 
	    long atx = 0;
	    long aty = 0;
	    //Nested loop is applied to test the every possible combination of x and y for n power and k range.
	    for (x = 10; x<=k; x++) 
	    {
	    	for (y = 10; y<=k; y++)
	    	{	
	    		long nearestmiss = 0;
	    		//Calculating the result of x^n + y^n
	    		long addxnyn = (long)((Math.pow (x, n))+(Math.pow (y, n)));
	        
	    		//Taking the nth root of x^n + y^n to calculate z
	    		z = (int) Math.pow (addxnyn, 1.0/n);
	    		//Subtract z^n from x^n + y^n, it will give us near miss
	    		long diffz = (long)(addxnyn - Math.pow (z, n));
	    		//Subtract x^n + y^n from (z+1)^n, it will give us an other near miss
	    		long diffz1 = (long)(Math.pow (z+1, n) - addxnyn);
	    		//Comparing both near misses and select the one which is smaller
	    		if(diffz<diffz1)
	    			nearestmiss = diffz;	        
	    		else
	    			nearestmiss = diffz1;
	        
	    		//As mentioned in Assignment's instruction applied the formula to calculate relative miss
	    		double relativemiss = 1. * nearestmiss / addxnyn;
	        
	        
	    		//comparing the relative miss from the smallest miss to find out Possible Smallest miss
	    		if(relativemiss<smallrelativedifference)
	    		{
	    			smallrelativedifference=relativemiss;
	    			atx = x; aty = y;
	    		}
	    				           
	        }
	    }
	    System.out.println("\nResults:\n\tx = "+atx+", y = "+aty+",  relative difference= " + String.format("%.7f", smallrelativedifference));
	}
}


