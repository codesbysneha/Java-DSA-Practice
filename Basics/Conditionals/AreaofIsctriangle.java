package Conditionals;
import java.util.Scanner;

public class AreaofIsctriangle {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base of the isosceles triangle:");
        double base=scanner.nextDouble();
        System.out.println("Enter the equal side  of the isosceles triangle:");
        double equalSide=scanner.nextDouble();
        double height=Math.sqrt(equalSide*equalSide-(base*base)/4);
        double area=0.5*base*height;
        System.out.println("Area of Isosceles Triangle is:"+area);
        scanner.close();
    }
    
}
