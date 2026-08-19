package Array;

public class SortingArray {
    public class SortZero {


        public static void main(String[] args){


            int[] array = { 1, 2, 0, 4, 0, 5, 8, 0};
            int zeroCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    zeroCount++;
                    System.out.println("Number of zeros" + zeroCount);
                }
            }

        }
    }
}
