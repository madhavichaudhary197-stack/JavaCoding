package AccessM;

import AccessModifiers.A;

public class D {
    static void main() {
        A a = new A();
        a.m1();  // public
       // a.m3(); // protected not access
    }

    void m4(){
        System.out.println("m4");
    }



}

class E extends A{

    static void main() {
        E e = new E();
        e.m1(); // public
        e.m3(); // protected access

        D d = new D();
        d.m4(); // default
    }

}
