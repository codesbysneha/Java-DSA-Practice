package Loops;
import java.util.Scanner;
public class AverageOfNNumbers 
{
    public static void main(String[] args)
    {
        System.out.println("how many numbers ? ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){//interations of the num
            sum=sum+n;//read and sum 
            n=sc.nextInt();//go to next num 
        }
        double avg=(double)(sum/n);
        System.out.println("The average of numbers is:"+avg);
        sc.close();
    } 

}
