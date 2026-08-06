package Array;


public class Loop {
    //attendance -> 1-30

    //Types of loops
    //1. For Loop
    //2. While Loop
    //3. do-While Loop

    // for-each
    // iterators

    public static void main(String[] args) {
        //1 initialization    30(-1)->decrement,  1(+1)->increment
        //2 test condition
        //3 Update (increment/ decrement)

        int[] array = {10, 20, 30, 40, 50};
        //10 20 30 40 50
        //0   1  2  3  4 (index based) start 0)
        //for(initialization; condition; update){
        //}
        //array.length = 5
        for (int i= 0; ; i++) {
            // i = 0  0 < 5 array[0] -> 10
            // i = 1  1 < 5 array[1] -> 20
            // i = 2  2 < 5 array[2] -> 30
            // i = 3  3 < 5 array[3] -> 40
            // i = 4  4 < 5 array[4] -> 50

            System.out.println("Element present in array at index " + "is" + array[i]);

        }


    }
    }

