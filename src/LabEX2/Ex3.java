package LabEX2;

import java.util.Scanner;

public class Ex3 {

    public class BiggestNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter First number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter Second number: ");
            int num2 = scanner.nextInt();


            if (num1 > num2) {
                System.out.println("Biggest number is: " + num1);
            } else if (num2 > num1) {
                System.out.println("Biggest number is :" + num2);
            } else {
                System.out.println("Both numbers are equal.");
            }

        }

    }
}

