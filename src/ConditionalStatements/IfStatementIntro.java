package ConditionalStatements;

public class IfStatementIntro {

    public static void main(String[] args) {

        //if age is greater than or equal to 18 print message 'You can cast your vote'
        //if age is less than or equal to 18 print message 'You can not cast your vote'

         int age = 10;

        /*if(age >= 18){      //1 >=18   19 >=18
            System.out.println("You cast your vote");
        }*/

        if(age >= 18) {    //1 >= 18    19 >= 18   10 >= 18
            System.out.println("You cast your vote");
        } else {
            System.out.println("You can not cast your vote");
        }

         /* boolean isItGoingToRainToday = true;

        if(isItGoingToRainToday){
            System.out.println("Bring umbrella with you");
        }*/

        //

        //if it starts raining print message 'Bring umbrella with you'
        //if it's not raining print 'Don't Bring umbrella with you'
        boolean isItGoingToRainTodayToday = false;

        if(isItGoingToRainTodayToday) {
            System.out.println("Bring umbrella with you");
        }else{
            System.out.println("Don't Bring umbrella with you");

        }

    }
}









