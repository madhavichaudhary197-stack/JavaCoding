package ConditionalStatements;

public class MoreIfElsePracticeResult {

    //Marks      8888
    //fail => marks < 35
    //passed class second => marks >= 35 && marks < 60
    //passed class first => marks >= 60 && marks < 75
    //passed first class with Distinction => marks >= 75 && marks < 90
    //Merit marks >= 90
    //please enter correct marks

    public static void main(String[] args) {

        int Marks = 8888;

        if (Marks >= 0 && Marks < 35) {
            System.out.println("Fail");
        } else if (Marks >= 35 && Marks < 60) {
            System.out.println("Passed Class Second");
        } else if (Marks >= 60 && Marks < 75) {
            System.out.println("Passed Class First");
        } else if (Marks >= 75 && Marks < 90) {
            System.out.println("Passed First Class With Distinction");
        } else if (Marks >= 90 && Marks <= 100) {
            System.out.println("Merit");
        } else {
            System.out.println("Please Enter Correct Marks");

        }

    }

}

