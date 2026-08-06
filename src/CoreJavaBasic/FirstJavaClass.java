package CoreJavaBasic;
import java.util.Scanner;
public class FirstJavaClass {

    //variables
    public static void main (String [] args){

        String name;
        int age;
        long mobileNo;
        float marks;
        char grade;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Name :");
        name = sc.next();

        System.out.println("Age :");
        age = sc.nextInt();

        System.out.println("Enter your mobaile number :");
        mobileNo = sc.nextLong();

        System.out.println("Enter your marks :");
        marks = sc.nextFloat();

        System.out.println("Enter your Grade :");
        grade = sc.next().charAt(0);


        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
        System.out.println("MobileNumber :"+mobileNo);
        System.out.println("Marks :"+marks);
        System.out.println("Grade :"+grade);





    }


    //methods



    //objects



}
