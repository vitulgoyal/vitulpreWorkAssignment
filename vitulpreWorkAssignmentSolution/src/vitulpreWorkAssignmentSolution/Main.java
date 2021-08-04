package vitulpreWorkAssignmentSolution;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:
				choice = 0;
				break;

			case 1: {
				obj.checkPalindrome();
			}
			break;
			
			case 2: {
				obj.printPattern();
			}
			break;

			case 3: {
				obj.checkPrimeNumber();
			}
			break;

			case 4: {
				obj.printFibonacciSeries();
			}
			break;

			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");
		sc.close();

	}



//function to checkPalindrome

public void checkPalindrome()  {
	String original, reverse = ""; // Objects of String class  
    Scanner in = new Scanner(System.in);   
    System.out.println("Enter a string/number to check if it is a palindrome");  
    original = in.nextLine();   
    int length = original.length();   
    for ( int i = length - 1; i >= 0; i-- ) {
       reverse = reverse + original.charAt(i);  
    }
    if (original.equals(reverse))  {
       System.out.println("Entered string/number is a palindrome."); 
    }
    else {
       System.out.println("Entered string/number isn't a palindrome."); 
    }
    in.close();
}



//function to printPattern

public void printPattern() {
	Scanner in = new Scanner(System.in);   
    System.out.println("Enter a number to create pyramid of length: "); 
	int rows = in.nextInt();
    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
    in.close();
}



//function to check no is prime or not

public void checkPrimeNumber() {
	Scanner in = new Scanner(System.in);  
    System.out.print("Enter a number : ");  
    int n = in.nextInt();  
    if (isPrime(n)) {  
        System.out.println(n + " is a prime number");  
    } else {  
        System.out.println(n + " is not a prime number");  
    }  
    in.close();
}

public boolean isPrime(int n) {  
    if (n <= 1) {  
        return false;  
    }  
    for (int i = 2; i < Math.sqrt(n); i++) {  
        if (n % i == 0) {  
            return false;  
        }  
    }  
    return true;  
}  



// function to print Fibonacci Series

public void printFibonacciSeries() {

	//initialize the first and second value as 0,1 respectively.
	int first = 0, second = 1;
	Scanner in = new Scanner(System.in);  
    System.out.print("Enter the length of series : "); 
    int count = in.nextInt();
    System.out.print(first+" "+second);//printing 0 and 1    
	printFibonacci(count, first, second);
	in.close();

}

public void printFibonacci(int count,int first, int second){    
	int third = 0;
    if(count>0){    
    	third = first + second;    
    	first = second;    
    	second = third;    
         System.out.print(" "+third);   
         printFibonacci(count-1, first, second);    
     }    
 }  



}
