package DataTypesunderstanding;
import java.util.Scanner;
public class Additionoftwonum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();
        float sum=num1+num2;
        sc.close();
        System.out.println("the sum of numbers is: " + sum);
    }
}
