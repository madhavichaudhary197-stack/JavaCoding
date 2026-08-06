package LabEX2;

import java.util.Scanner;

public class Ex13 {

    public class EvenPrivateNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int start = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int end = scanner.nextInt();
            System.out.println("Even numbers");
            if (start < end)  {
                for (int i = start; i <= end; i++) {
                    if ( i % 2 == 0) {

                    }
                }
            } else {
                for (int i = start; i >= end; i --) {
                    if (i % 2 ==0) {
                        System.out.println(i + " ");
                    }

                }

            }
            scanner.close();
        }

    }
}
