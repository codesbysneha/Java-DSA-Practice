package Variableassignmentques;
public class Question1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        double result=Average(a,b,c);
        System.out.println("The average is: " + result);
    }
    public static double Average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    
}
