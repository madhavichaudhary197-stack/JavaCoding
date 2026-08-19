package BasicJava.Scanner;
import java.util.Scanner;


public class Java {
    public static void main(String[] args){

        // Step 1: Create Scanner Object
        Scanner sc = new Scanner(System.in);

        // Step 2: Prompt user for input
        System.out.println("Enter an integer: ");

        // Step 3: Read integer input
        int number = sc.nextInt();

        // Step 4: Print the entered the interger
        System.out.println("yor entered: " + number);

        // Close the Scanner
        sc.close();

    }

}
