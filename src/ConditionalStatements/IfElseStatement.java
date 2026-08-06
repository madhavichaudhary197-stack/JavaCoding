package ConditionalStatements;

public class IfElseStatement {

    public static void main(String[] args) {
        int a = 10;

        if(a == 10) {
            System.out.println("Value of a is 10");
        } else if ( a == 20) {
            System.out.println("Value of a is 20");
        } else if ( a == 30) {
            System.out.println("Value of a is 30");
        } else {
            System.out.println("Value of a is some random value");
        }
    }
}
