package LabEX2;

public class Ex19 {
    public class IncrementalNumberPattern{
        public static void main(String[] args){
            int num = 1;
            for (int i = 1; i <= 5; i++){
                for (int j = 1; j <= i; j++) {
                    System.out.println(num + " ");
                    num ++;
                }
                System.out.println();
            }
        }
    }
}
