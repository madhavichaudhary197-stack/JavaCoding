package LabEX2;

public class Ex11 {
    public class print2DArray {

        public static void main(String[] args) {
            int[][] x = {{10, 20, 30}, {40, 50, 60}};
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++) {
                    System.out.println(x[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}