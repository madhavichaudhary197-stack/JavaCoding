package LabEX2;

import java.util.Scanner;

public class Ex8 {


    public class LeapYearCheck {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a year: ");
            int year = scanner.nextInt();
            boolean b = year % 400 == 0;
            if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
                System.out.println("The year " + year + "is a leap year. ");
            } else {
                System.out.println("The year " + year + "is not a leap year. ");
            }
            scanner.close();
        }
    }

    }


