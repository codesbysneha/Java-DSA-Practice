package DataTypesunderstanding;
//Find total and percentage of marks
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        System.out.println("Enter subject1 Marks:");
        Scanner sc=new Scanner(System.in);
        float marks1=sc.nextFloat();
        System.out.println("Enter subject2 Marks:");
        float marks2=sc.nextFloat();
        System.out.println("Enter subject3 Marks:");
        float marks3=sc.nextFloat();
        float total=(marks1+marks2+marks3);
        float percentage = (total / 300) * 100;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        sc.close();
    }
    
}
