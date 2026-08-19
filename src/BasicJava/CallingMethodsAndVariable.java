package BasicJava;

public class CallingMethodsAndVariable {

    int age = 50;
    double salary = 100000;

    void method1(){
        System.out.println("this method does not take any param");
    }

    void show(){
        System.out.println("this is show method");
    }


    public static void main(String[] args){
        //
        System.out.println("this is starting point from where execution begins");

        CallingMethodsAndVariable obj = new CallingMethodsAndVariable();

        //syntax for accessing variables
        //objectreference.variablename;
        System.out.println(obj.age);  //50
        System.out.println(obj.salary);  //1000000
    }
}
