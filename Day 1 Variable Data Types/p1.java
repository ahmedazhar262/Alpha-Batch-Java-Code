// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;

public class p1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st No:");
        int num1= sc.nextInt();

        System.out.println("Enter 2nd No:");
        int num2= sc.nextInt();

        System.out.println("Enter 3rd No:");
        int num3= sc.nextInt();

        // Averager of these three numbers 8
        
        int avg= (num1+num2+num3)/3;

        System.out.println(avg);
    }
}
