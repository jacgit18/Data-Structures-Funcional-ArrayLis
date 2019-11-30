package edu.citytech.cst;


public class Snippet {
	public int[] returnArray() {
		  int[] x;

	      x = new int[3];    // Create an array of 3 elements

	      x[0] = 2;
	      x[1] = 3;
	      x[2] = 45;

	      return( x );         // Return the **reference** (location) of the array
	   }
	
}