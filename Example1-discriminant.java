/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
			System.out.print("Enter a:");
			double a = read.nextInt();
			System.out.print("Enter b:");
			double b = read.nextInt();
			System.out.print("Enter c:");
			double c = read.nextInt();
			double discriminant = 0;
			if (a == 0) 
			{
			if (b == 0)
			{
			if (c == 0)
			{
			System.out.print("\nEvery number is solution");
			} else
			System.out.print("\nNo solution");
			} else
			System.out.print("\nSolution is" + -c / b);
			} else {
			System.out.print("Discriminant = " + (discriminant = Math.pow(b, 2) - 4 * (a * c) / 4 * Math.pow(a, 2)));
			}
			if (discriminant == 0) {
			System.out.print(-b / 2 * a);
			} else if (0 > discriminant) {
			System.out.print("\nThere are two complex solutions = " + (-b / 2 * a + Math.sqrt(-discriminant)) + " and "
			+ ((-b / 2 * a - Math.sqrt(-discriminant))));

			} else if (discriminant > 0) {
			System.out.print("\nThere are two real solutions = " + (-b / 2 * a + Math.sqrt(discriminant)) + " and "
			+ ((-b / 2 * a) - Math.sqrt(discriminant)));
			}

			}
    }
    

