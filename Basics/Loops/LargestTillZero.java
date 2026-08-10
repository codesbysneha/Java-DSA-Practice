package Loops;
import java.util.Scanner;
public class LargestTillZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (Enter 0 to stop):");
        int n = sc.nextInt();
        int largest = n;
        while (n != 0) {
            if (n > largest) {
                largest = n;
            }
            n = sc.nextInt();
        }
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
