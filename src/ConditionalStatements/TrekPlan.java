package ConditionalStatements;



public class TrekPlan {

    public static void main(String[] args) {

        boolean plan = true;
        String bike = "A";

        if (plan) {
            if (bike.equals("A"))
            {
                System.out.println("Bike driver A");
            System.out.println("Petrol paid by other person");
        } else {
            System.out.println("Bike driver B");
            System.out.println("Petrol paid  50-50");
          }
        } else{
            System.out.println("No trekking due to XYZ reason");

        }
    }

}