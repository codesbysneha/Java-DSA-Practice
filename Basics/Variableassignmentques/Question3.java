package Variableassignmentques;
import java.util.Scanner;
/*
Take the cost of three items — a pencil, a pen, and an eraser — as input using 
the float type, then output the total as a bill. 
(Bonus: try adding 18% GST to the total.) */
public class Question3 {
    public static void main(String[] args){
        System.out.println("Enter the cost of pencil, pen and eraser");
        Scanner sc = new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=Total(pencil,pen,eraser);
        System.out.println("The total cost is: "+total);
        sc.close();
    }
    public static float Total(float pencil,float pen,float eraser){
        float total=pencil+pen+eraser;
        //type conversion
        float gst=(float)(total*0.18f);
        return total+gst;
    }

}
