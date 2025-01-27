package LeapYear;

import java.util.Scanner;

/*
 * LEAP YEAR
 * ---------
 * This program is to check the given number is leap year or not.
 *
 * Leap Year Conditions
 * 1. A year is a leap year if it is divisible by 4.
 * 2. However, if the year is divisible by 100, it is not a leap year unless:
 * 3. The year is also divisible by 400.
 * 
 * Example
 * 2000 is a leap year because it is divisible by 400.
 * 1900 is not a leap year because it is divisible by 100 but not by 400.
 * 2024 is a leap year because it is divisible by 4 but not by 100.
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year :: ");
		int year = scanner.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("YES LEAP YEAR!");
		else
			System.out.println("No its not leap year.");
		
		scanner.close();
	}
}
/*
	INPUT
	Enter a year :: 2020
	OUTPUT
	YES LEAP YEAR!
	
	INPUT
	Enter a year :: 2000
	OUTPUT
	YES LEAP YEAR!
	
	INPUT
	Enter a year :: 1996
	OUTPUT
	YES LEAP YEAR!

	INPUT
	Enter a year :: 2100
	OUTPUT
	No its not leap year. 

	INPUT
	Enter a year :: 2019
	OUTPUT
	No its not leap year.

*/