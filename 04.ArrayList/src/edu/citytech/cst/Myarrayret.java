package edu.citytech.cst;

public class Myarrayret {

	public static void main(String[] args) {
		
		Snippet ad = new Snippet();

		int[] a = ad.returnArray();

		System.out.println("Array AFTER calling returnArray:");

		
		
		for (int i : a) {
			System.out.println(i);

		}
		
	}

}
