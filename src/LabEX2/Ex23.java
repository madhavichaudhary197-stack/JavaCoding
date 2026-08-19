package LabEX2;

public class Ex23 {
    public class ContinueSatement {
        public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) {

                if (i == 3) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
