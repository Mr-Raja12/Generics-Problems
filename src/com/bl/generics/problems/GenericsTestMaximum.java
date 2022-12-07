package com.bl.generics.problems;

import java.util.Scanner;

/**
 * 
 * @author Raja To find the max integer among three integer using compareTo
 *         method
 *
 */
public class GenericsTestMaximum {
	 /**
	 * @param main method to call the compareTo method
	 */
	public static void main(String[] args) {
		Integer firstNumber, secoundNumber, thirdNumber;
		System.out.println("Enter the three integer");
		Scanner scanner = new Scanner(System.in);
		firstNumber = scanner.nextInt();
		secoundNumber = scanner.nextInt();
		thirdNumber = scanner.nextInt();
		System.out.println("Maximum among three integer");
		GenericsTestMaximum max = new GenericsTestMaximum();
		max.findMax(firstNumber, secoundNumber, thirdNumber);

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

}