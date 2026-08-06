package Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // Comparsion operators
        int a = 10;
        int b = 10;
        int c = 5;


        System.out.println("a > b: " + (a > b));   //10 > 3 = false
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));   //10 >= 3 true 10 >= 1
        System.out.println("a <= b: " + (a <= b));  //10 <=10 true
        System.out.println("a ==c: " + (a == c));   //10 == 5 false
        System.out.println("a != c: " + (a != c));  //10 !=5 true
    }

}
