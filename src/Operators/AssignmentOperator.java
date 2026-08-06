package Operators;

public class AssignmentOperator {

    public static void main(String[] args) {

        //initial value
        int num = 10;
        System.out.println("Initial: " + num);   //110

        // add 5 num = num + 5
        num +=+ 5;  // num = num + 5
        System.out.println("After +5: " + num);   //5  10  15

        // multiply by 2 num = num * 2
        /* num *= 2;
        System.out.println("After *2: " + num);    //20  30


        // subtract 5 num = num - 5
        num -= 5;
        System.out.println("After - 5: " + num);

        // divide by 2 num = num / 2
        num /= 2;
        System.out.println("After /2: " + num);

        // reminder after dividing by 3 num = num % 3
        num %=3;
        System.out.println("After %3: " + num);

        // multiply by 2 num = num * 2
        /* num *= 2;
        System.out.println("After *2: " + num);



         */
    }
}
