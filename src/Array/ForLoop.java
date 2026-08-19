package Array;

public class ForLoop {
    public class SortZero {

        public static void main(String[] args){

            int[] array = {1, 2, 0, 4, 0, 5, 8, 0};  // uses 3 for-loops
            int count = 0;

            //Count Zeros

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    count++;
                }

            }
            //Print Zeros

            for (int i = 0; i < count; i++) {
                System.out.println("0");
            }

            //Print Non-Zeros-element

            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    System.out.println(array[i] + " ");
                }

            }



        }


    }
}
