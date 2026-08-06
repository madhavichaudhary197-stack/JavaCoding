package OOPS.Inheritace;

public class IntroToInheritance extends parent1 {

    int salary = 1000000;

    void dummy(){
        System.out.println("this method is present in IntroInheritance class");
    }

    public static void main(String[] args) {
        IntroToInheritance obj = new IntroToInheritance();
        obj.dummy();
        obj.parentClassMethod();
        System.out.println("access parent class property age "+obj.age);

    }
}


class parent1 {
    int age = 100;

    void parentClassMethod(){
           System.out.println ("this method is parent1 class");

   }

}

class child1 {
    void tt(){
        System.out.println("Child");
    }
}


class child2 extends child1{
    public static void main(String[] args) {
        child2 ch = new child2();
        ch.tt();
    }
}