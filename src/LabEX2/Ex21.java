package LabEX2;

public class Ex21 {
    public class PyramidPattern{
        public static void main(String[] args){

            int rows = 5;
            for (int i = 1; i <= rows; i++){

                //print spaces
                for (int space = 1; space <= rows-i; space++) {
                    System.out.println(" ");
                }
                //print incresing numbers
                for (int num = 1; num <= i; num ++) {
                    System.out.println(num + " ");
                }
                //print decreasing numbers
                for (int num = i-1; num >= 1; num--) {
                    System.out.println(num + " ");
                }
                System.out.println();
            }
        }
    }
}
