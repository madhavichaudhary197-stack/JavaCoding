package AccessModifiers;

import AccessM.D;

public class A {

    public void m1(){
        System.out.println("m1");
    }
    protected void m3(){
        System.out.println("m3");
    }
}

class B{

    private void m2(){
        System.out.println("m2");
    }

    static void main() {
        B b = new B();
        b.m2();

        D d = new D();
        //d.m4();  // default accessmodifier not access
    }
}

class Main{

    static void main() {
        A a = new A();
        a.m1();
        a.m3();

        B b = new B();
       // b.m2;


    }
}
