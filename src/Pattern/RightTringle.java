package Pattern;

public class RightTringle {
    public static void PrintRightTringle(int rows) {

        for (int i = 1; i <= rows; i++) {   // Outer loop
            for (int j = 1; j <= i; j++) {  // Inner loop
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PrintRightTringle(5);

    }
}
