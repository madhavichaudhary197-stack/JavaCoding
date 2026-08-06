package ConditionalStatements;

public class NestedIfElse {

    public static void main(String[] args) {
        //marks field
        int marks = 100;
        boolean feesPaid = true;

        if(marks > 35){

            if(feesPaid){
                System.out.println("passed and result released");
            } else {
                System.out.println("as student is yet to pay fees," + " don't publish his/her result");

            }
        } else {
            System.out.println("Student is failed in exam ");
        }
    }
}


   // plan decided are going for trek A B
          //choose bike    A
          //bike drive
          //petrol will paid by other
          //bike drive  B
         //PETROL 50-50 paid
   //no trekking due to xyz reason
