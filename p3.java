// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter cost of Pencil:");
        float pencil= sc.nextFloat();

        System.out.println("Enter cost of Pen:");
        float pen= sc.nextFloat();

        System.out.println("Enter cost of Eraser:");
        float eraser= sc.nextFloat();


        float sum= pencil+ pen + eraser;

        float tax= (18*sum)/100;

        float total_cost= sum+tax;

        System.out.println("Total cost of Pencil, Pen and Eraser with adding  18% tax is: "+ total_cost);

    }
    
}
