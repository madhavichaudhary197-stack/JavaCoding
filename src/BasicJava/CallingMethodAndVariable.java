public class callingMethodAndVariable {

    int age = 100;
    double salary = 100000;


    void method1(){
        System.out.println("this method does not take any param");
    }

    void method2(int a){
        System.out.println("this method takes 2 parameters");
    }

    public void main(String[] args) {

        }
    {
        //
        System.out.println("this is starting point from where execution begins");

        callingMethodAndVariable obj = new callingMethodAndVariable();

        //Syntax for accessing variables
        //objectrefecrence.variablename;

        System.out.println(obj.age);  //50
        System.out.println(obj.salary); //1000000

        //syntax for accessing methos
        //objectReference.methodName();

        obj.method1();
        obj.show();

        //objectReference.methodName(param1, params2, ...);
    }

    private void show() {
        callingMethodAndVariable obj = new callingMethodAndVariable();
        obj.method2(1212);  //Enter your PIN 10000
        obj.method3(1000);

    }

    private void method3(int i) {
    }


}

    void method2(int a) {
         System.out.println("this method takes 1 parameters");
     }

     void method3(int a, int b){

     System.out.println("this method takes 1 parameters");

}

void main() {
}




