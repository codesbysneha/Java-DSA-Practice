package Conditionals;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args){
        System.out.println("Enter the side a trinagle :");
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        double area= Math.sqrt(3)/4*(side*side);
        System.out.println("area of an equilateral traingle is:"+area);
        sc.close();
    }

}
