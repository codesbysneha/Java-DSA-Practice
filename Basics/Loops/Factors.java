package Loops;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args){
        System.out.println("Enter a number to find its factors:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factors of "+n+" are:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
