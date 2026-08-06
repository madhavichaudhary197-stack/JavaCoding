package LabEX2;

public class Ex12 {
    public class ContinueDemo {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i == 4)
                    continue;
                System.out.println("i = " + i);
            }
        }
    }
}
