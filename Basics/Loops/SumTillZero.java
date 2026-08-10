package Loops;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Initialize with a non-zero value to enter the loop
        while (number != 0) 
        {
            System.out.println("Enter a number (0 to stop):");
            number = sc.nextInt();
            sum += number;
        }
        sc.close();
        System.out.println("The sum of the entered numbers is: " + sum);
    }
    
}
