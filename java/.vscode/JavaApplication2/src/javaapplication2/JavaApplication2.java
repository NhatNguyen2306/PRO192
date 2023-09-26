/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author NHAT NGUYEN
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_tap_1 {
	public static void calculate(double a, double b, char op) {
		switch (op) {
		case '+':
			System.out.println(a + " + " + b + " = " + (a + b));
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + (a - b));
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + (a * b));
			break;
		case '/':
			System.out.println(a + " / " + b + " = " + (a / b));
			break;
		default:
			System.out.println("No result");
		}
	}

	public static void printName(String lastName, String middleName, String firstName) {
		System.out.println("The full name is: " + lastName + " " + middleName + " " + firstName);
	}

	public static double grades(double chuyenCan, double giuaKy, double cuoiKy) {
		double hocPhan = chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7;
		return hocPhan;
	}

	public static void check(int n, String arr[], String name) {
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (arr[i].equals(name)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {

		System.out.println("MENU\n");
		System.out.println("----------");
		System.out.println("1. Entering 2 numbers from the keyboard to print the results of addition, subtraction, multiplication, and division.");
		System.out.println("2. Enter your first and last name, print out the full name.");
		System.out.println("3. Enter the attendance score (10%), midterm (20%), and final semester (70%) to print the course score.");
		System.out.println("4. Enter the full name to check whether it exists in the initialization list or not. If so, print \"Yes\", otherwise print \"No\"");
		System.out.println("Other to quit.");
		System.out.println("----------");
		
		int choice, flag = 1;
		Scanner input = new Scanner(System.in);
		
		while (flag == 1) {
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				
				double a, b;
				System.out.println("Enter a: ");
				a = input.nextDouble();
				System.out.println("Enter b: ");
				b = input.nextDouble();
				System.out.println(" Enter operation: ");
				char op;
				op = input.next().charAt(0);
				calculate(a, b, op);
				break;
				
			case 2:

				System.out.println("Enter the first name: ");
				String firstName = input.next();
				System.out.println("Enter the middle name: ");
				String middleName = input.next();
				System.out.println("Enter the last name: ");
				String lastName = input.next();
				printName(lastName, middleName, firstName);
				break;
				
			case 3:

				double chuyenCan, giuaKy, cuoiKy;
				System.out.println("Enter the attendence: ");
				chuyenCan = input.nextDouble();
				System.out.println("Enter the midterm: ");
				giuaKy = input.nextDouble();
				System.out.println("Enter the final:");
				cuoiKy = input.nextDouble();
    }
    
}
