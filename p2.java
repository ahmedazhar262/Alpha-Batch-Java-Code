public class p2 {
    // In a program, input the side of a square. You have to output the area of the square.


import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter sides:");
        int side= sc.nextInt();

        int area= side*side;

        System.out.println("area of Square is: "+ area);

    }

    
}

}
