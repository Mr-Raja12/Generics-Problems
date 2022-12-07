package com.bl.generics.problems;

import java.util.Scanner;

/**
 * 
 * @author Raja 
 * 1)To find the max integer among three integer using compareTo
 * method 
 * 2)To find the max integer among three String using compareTo
 *  method
 *
 */
public class GenericsTestMaximum {
	/**
	 * @param main method to call the compareTo method
	 */
	public static void main(String[] args) {
		Integer firstNumber, secoundNumber, thirdNumber;
		String firstString, secoundString, thirdString;
		System.out.println("Enter the three integer");
		Scanner scanner = new Scanner(System.in);
		firstNumber = scanner.nextInt();
		secoundNumber = scanner.nextInt();
		thirdNumber = scanner.nextInt();
		System.out.println("Enter the three String");
		firstString = scanner.nextLine();
		secoundString = scanner.nextLine();
		thirdString = scanner.nextLine();

		System.out.println("Maximum among three integer");
		GenericsTestMaximum max = new GenericsTestMaximum();
		max.findMax(firstNumber, secoundNumber, thirdNumber);
		max.findMax(firstString, secoundString, thirdString);

	}

	/**
	 * Created a method to initialize the three integer
	 * 
	 * @param firstNumber
	 * @param secoundNumber
	 * @param thirdNumber
	 */
	public void findMax(Integer firstNumber, Integer secoundNumber, Integer thirdNumber) {

		Integer maxNumber;
		/*
		 * Checking the condition b/w three value
		 */
		if (firstNumber.compareTo(secoundNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
			maxNumber = firstNumber;
		}

		else if (secoundNumber.compareTo(firstNumber) > 0 && secoundNumber.compareTo(thirdNumber) > 0) {
			maxNumber = secoundNumber;
		}

		else {
			maxNumber = thirdNumber;
		}
		System.out.println("Maximum integer is : " + maxNumber + " among " + firstNumber + ", " + secoundNumber
				+ " and " + thirdNumber);
	}

	/**
	 * Created a method to initialize the three String
	 * 
	 * @param firstString
	 * @param secoundString
	 * @param thirdString
	 */
	public void findMax(String firstString, String secoundString, String thirdString) {

		String maxString;

		if (firstString.compareTo(secoundString) > 0 && firstString.compareTo(thirdString) > 0) {
			maxString = firstString;
		}

		else if (secoundString.compareTo(firstString) > 0 && secoundString.compareTo(thirdString) > 0) {
			maxString = secoundString;
		}

		else {
			maxString = thirdString;
		}
		System.out.println("Maximum String is : " + maxString + " among " + firstString + ", " + secoundString + " and "
				+ thirdString);
	}

}