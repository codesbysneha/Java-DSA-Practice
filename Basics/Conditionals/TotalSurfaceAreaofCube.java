package Conditionals;
import java.util.Scanner;
public class TotalSurfaceAreaofCube {
    public static void main(String[] args){
        System.out.println("Enter the side of a cube:");
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double totalSurfaceArea=6*side*side;
        System.out.println("Total Surface Area of Cube is:"+totalSurfaceArea);
        sc.close();
    }
    
}
