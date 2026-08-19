package BasicJava;

public class MoreMethodSyntax {

    //syntax for creating an object of class
    //ClassName reference/identifier = new ClassName();

    MoreMethodSyntax abcd = new MoreMethodSyntax();

    MoreMethodSyntax xyz = new MoreMethodSyntax();

    // syntax 3
    // returnType methodName(){
    // code will go here
//}

// whenever a method returns anything other than void,
// writing return statement inside method is mandatory

 // method return type and the value we are returning from the method must

int returnInteger() {

    return 1000;

}

boolean isItGoingToRain(){
    return true;
}

String getName(){
    String s = "Java";
    return s;
}

int method1(){
    System.out.println("This is simple method ");
    return 0;
}
}



// syntax 4
//returnType methodName(datatype param1, datatype param2,....){
//write your logic here
//}

// syntax 3
// returnType methodName(){
// code will go here
//}

// int addition(int a, int b){
// int c = a + b;
//return c;
// return "c";




