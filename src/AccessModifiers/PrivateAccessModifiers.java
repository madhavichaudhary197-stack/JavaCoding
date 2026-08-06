package AccessModifiers;

public class PrivateAccessModifiers {
    //What ever private we can not access it outside the class

    private int age;  //private
    int salary;  //default
    public double  interest; // public
    protected String address;  //protected

    void test(){
        System.out.println("this method is having default access modifiers");
    }

    private void privateMethod(){
        System.out.println("this method is having private access modifier");
    }

    protected void proMethod(){
        System.out.println("this is protected method");
    }

    public void abcd(){
        System.out.println("this is public method");
    }
}
