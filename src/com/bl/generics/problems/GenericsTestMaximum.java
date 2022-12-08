package com.bl.generics.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Raja 
 * 1)To find the max integer among three integer using compareTo method 
 * 2)To find the max integer among three String using compareTo method 
 * 3)To find the max Float among three Float using compareTomethod 
 * 4)Extend the max method to take more then three parameters
 */
public class GenericsTestMaximum<T extends Comparable<T>> {

	T varOne;
	T varTwo;
	T varThree;
	T varFour;
	T varFive;

	public GenericsTestMaximum(T varOne, T varTwo, T varThree, T varFour, T varFive) {
		super();
		this.varOne = varOne;
		this.varTwo = varTwo;
		this.varThree = varThree;
		this.varFour = varFour;
		this.varFive = varFive;
	}

	public void findMax() {

		GenericsTestMaximum.max(this.varOne, this.varTwo, this.varThree, this.varFour, this.varFive);

	}

	/**
	 * @param main method to call the compareTo method
	 */
	public static void main(String[] args) {
		Integer firstNumber, secoundNumber, thirdNumber, forthNumber, fifthNumber;
		String firstString, secoundString, thirdString, forthString, fifthString;
		Float firstFloat, secoundFloat, thirdFloat, forthFloat, fifthFloat;
		System.out.println("Enter the five integer");
		Scanner scanner = new Scanner(System.in);
		firstNumber = scanner.nextInt();
		secoundNumber = scanner.nextInt();
		thirdNumber = scanner.nextInt();
		forthNumber = scanner.nextInt();
		fifthNumber = scanner.nextInt();

		System.out.println("Enter the five String");
		firstString = scanner.nextLine();
		secoundString = scanner.nextLine();
		thirdString = scanner.nextLine();
		forthString = scanner.nextLine();
		fifthString = scanner.nextLine();

		System.out.println("Enter the five Float");
		firstFloat = scanner.nextFloat();
		secoundFloat = scanner.nextFloat();
		thirdFloat = scanner.nextFloat();
		forthFloat = scanner.nextFloat();
		fifthFloat = scanner.nextFloat();

		System.out.println("***** Test Maximum among five ***** ");
		max(firstNumber, secoundNumber, thirdNumber, forthNumber, fifthNumber);
		max(firstString, secoundString, thirdString, forthString, fifthString);
		max(firstFloat, secoundFloat, thirdFloat, forthFloat, fifthFloat);

	}

	public static <E extends Comparable<E>> void max(E firstVar, E secondVar, E thirdVar, E fourthVar, E fifthVar) {

		ArrayList<E> varList = new ArrayList<>();

		varList.add(firstVar);
		varList.add(secondVar);
		varList.add(thirdVar);
		varList.add(fourthVar);
		varList.add(fifthVar);

		System.out.println(Collections.max(varList) + " is the maximum out of " + varList);

	}
}