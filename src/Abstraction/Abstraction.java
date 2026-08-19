package Abstraction;

public class Abstraction {
    // Abstract class
    abstract class MyTest {
        abstract void calculate(int a, int b);
    }
    // Subclass: Addition
    class Addition extends MyTest
    {
        void calculate(int a, int b){
            int x = a + b;
            System.out.println("sum: " +x);

        }
    }
    // subclass2: Substraction
    class Substraction extends MyTest
    {
        void calculate (int a, int b)
        {
            int y = a -b;
            System.out.println("Substract:" +y);
        }
    }
    // Subclass Multiplication
    class Multiplication extends MyTest
    {
        void calculate (int a, int b)
        {
            int z = a * b;
            System.out.println("Multiply:" +z);
        }
    }
    // main class
    public class MyClass {
        public static void main(String[] args) {

        }

    }
    }

