import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int numOne;
        int numTwo;

        //asking for numbers
        System.out.println("Enter a number: ");
        if (scan.hasNextInt()) {
            numOne = scan.nextInt();
            System.out.println("Enter another number: ");
            if (scan.hasNextInt()) {
                numTwo = scan.nextInt();
                if (numOne > numTwo) {
                    System.out.println(numOne + " is greater than " + numTwo);
                } else if (numTwo > numOne) {
                    System.out.println(numTwo + " is greater than " + numOne);
                } else
                    System.out.println(numOne + " is equal to " + numTwo);
            } else
                System.out.println("THAT'S NOT A NUMBER");
        } else
            System.out.println("THAT'S NOT A NUMBER");
    }
}