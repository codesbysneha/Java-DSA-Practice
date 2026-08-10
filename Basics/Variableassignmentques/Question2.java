package Variableassignmentques;
import java.util.Scanner;
public class Question2 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a=sc.nextFloat();
        float result=Areaofsqaure(a);
        System.out.println("The Area of square is:"+result);
        sc.close();

    }
    public static float Areaofsqaure(float a)
    {
        return a*a;
    }

}
