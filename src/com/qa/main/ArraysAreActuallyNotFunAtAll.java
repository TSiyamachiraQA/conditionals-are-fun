package com.qa.main;

public class ArraysAreActuallyNotFunAtAll {

	int nicksSalary = 23500;
	int robsSalary = 0;
	int geoffsSalary = 450000;
	// this is rubbish, we want to collect them together!

	static int[] salaryArray; // declaring an array of integers, but it's empty (and therefore NULL)
	static int[] salaryArray2 = { 23500, 0, 450000 }; // 0|23500 , 1|0, 2|450000
	static int[] salaryArray3 = new int[5]; // declaring an array of 5 integers, but it's still empty, it just exists
	static Integer[] salaryArray4 = new Integer[5];

	public static void main(String[] args) {
		System.out.println(salaryArray);

		System.out.println(salaryArray2.length);

		for (int i = 0; i < salaryArray2.length; i++) {
			System.out.println(salaryArray2[i]);
		}

		for (int i = 0; i < salaryArray3.length; i++) {
			System.out.println(salaryArray3[i]);
		}

		for (int i = 0; i < salaryArray4.length; i++) {
			System.out.println(salaryArray4[i]);
		}

	}

}
