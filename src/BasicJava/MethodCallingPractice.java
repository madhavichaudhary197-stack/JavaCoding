package BasicJava;

public class MethodCallingPractice {

    void a(){
        System.out.println("this is a method");
    }

    void b(int a, String b){
        System.out.println("method b takes 2 param");
    }

    void c(int a, String b, boolean t){
        System.out.println("method c takes params");

    }
    public static void main(String[] args){
        MethodCallingPractice abc = new MethodCallingPractice();
        abc.b(900, "java");
        abc.c(123, "Test", true);

        int tempResult = abc. addition(10, 20, 90);  //120    20
        tempResult = tempResult + 80;   //200    100
        System.out.println("Final result is "+tempResult);  //100
        abc.addition(10, 20, 90);
    }
      int addition(int a, int b, int c){
        int result = a + b + c;
        return result;  //120

      }

      int add1(int a, String s){
        return a;

      }
}
