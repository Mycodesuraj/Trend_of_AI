package jav;
import java.util.Scanner;
public class Father_teressa {

	public static void main(String[] args) {
		System.out.println("Hello World.");
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your course: ");
		String course = sc.nextLine();
		System.out.println("Enter your college name: ");
		String college = sc.nextLine();
		System.out.println("name: "+name);
		System.out.println("course: "+course);
		System.out.println("college: "+college);
		System.out.println("Enter number1: ");
		float num1 = sc.nextInt();
		System.out.println("Enter number2: ");
		float num2 = sc.nextInt();
		float sum = num1 + num2;
		System.out.println("number1: "+num1);
		System.out.println("number2: "+num2);		
		System.out.println("sum: "+sum);
	
		System.out.println("Enter p: ");
		float p = sc.nextFloat();
		System.out.println("Enter r: ");
		float r = sc.nextFloat();
		System.out.println("Enter t: ");
		float t = sc.nextFloat();
		sc.nextLine();		
		float si = p*r*t;
		System.out.println("SI: "+si);
	
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double pi = Math.PI; 
		double area = pi*radius;
		System.out.println("Area of circle: "+area);
	
		int var1 = 3;
		int var2 = 2;
		int var3;
		var3=var1;
		var1=var2;
		var2=var3;
		System.out.println("var1: "+ var1 +", var2: "+var2);
		
		int var1 = 3;
		int var2 = 2;
		var1 = var1 + var2;
		var2 = var1 - var2;
		var1 = var1 - var2;
		System.out.println("var1: "+ var1 +", var2: "+var2);
		
		//7. Write a program to check whether a number is even or odd.
		int num3 = 3;
		if(num3%2==0) {
			System.out.println("num3 is even number.");
		} else {
			System.out.println("num3 is odd number");
		}
	
		//8. Write a program to find the largest of three numbers.
		int num4=2;
		int num5=2;
		int num6=3;
		if(num4>=num5) {
			if(num4>=num6) {
				System.out.println("num4 is largest.");
			} else {
				System.out.println("num6 is largest.");
			}
		} else if(num5>num4) {
			if(num5>=num6) {
				System.out.println("num5 is largest.");
			} else {
				System.out.println("num6 is largest.");
			
		}
		
		
	}
	
		//9. Write a program to check whether a number is positive, negative, or zero.
		int num7 = 0;
		if(num7>0) {
			System.out.println("number is positive.");
		} else if(num7==0) {
			System.out.println("number is zero.");
		} else {
			System.out.println("number is negative.");
		}
		*/
		
		//10. Write a program to calculate percentage and grade of a student.
		System.out.println("Enter marks of 1st subject: ");
		double sub1 = sc.nextDouble();
		System.out.println("Enter marks of 2nd subject: ");
		double sub2 = sc.nextDouble();
		System.out.println("Enter marks of 3rd subject: ");
		double sub3 = sc.nextDouble();
		System.out.println("Enter marks of 4th subject: ");
		double sub4 = sc.nextDouble();
		System.out.println("Enter marks of 5th subject: ");
		double sub5 = sc.nextDouble();
		
		double percentage = (sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("Percentage: "+percentage);
		
		char grade;
		if(percentage>=90 && percentage<=100) {
			grade = 'A';
		} else if(percentage>=80 && percentage<90) {
			grade = 'B';
		} else if(percentage>=70 && percentage<180) {
			grade = 'C';
		} else if(percentage>=90 && percentage<=100) {
			grade = 'A';
		}   }
}
