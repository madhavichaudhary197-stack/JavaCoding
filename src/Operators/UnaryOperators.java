package Operators;

public  class UnaryOperators {
    /*post-increment (a++) returns the first, value increments it.
    pre-increment (++a) increments first, then returns the updated value.*/


    public static void main(String[] args) {

        int a = 100;

        System.out.println("step 1 "+(a++));    //100
        System.out.println("step 2 "+(++a));    //102
        System.out.println("step 3 "+a);        //102
        // a = a + 1;
        /* System.out.println("value of a "+(a++)); //post-increment (a++) returns the same value first, then increments it by 1.
        System.out.println("value of a after post increment "+a);//*/

         /* System.out.println("value of a "+(++a)); //pre-increment (++a) increase the value by 1, then returns the updated value
         System.out.println("value of a after post increment "+a); //101*/

        System.out.println("value of a " + a);  //101

        int b = 200;
        b = b - 1;

        System.out.println("value of b " + b);  //199
    }

}
