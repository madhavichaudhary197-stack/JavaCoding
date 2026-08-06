package CoreJavaBasic;

public class Methods {
    //Creating methods
    //Method1
   void method() {
       System.out.println("This is simple method");
   }

   //Method2
    void method2(int a,int b){
       int c = a-b;
       System.out.println("substraction is :"+c);

    }

    //Method3
    int returnInteger(){
       return 1000;

    }

    //Method4
    int add(int p,int q){
       int r = p+q;
       System.out.println("Addition is :"+r);
       return r;
    }
}
