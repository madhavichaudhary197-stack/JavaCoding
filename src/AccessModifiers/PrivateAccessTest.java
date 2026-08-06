package AccessModifiers;

public class PrivateAccessTest {

    void test(){
        System.out.println("test method is part of class PrivateAccessTest");

    }

    private void Primethod(){
        System.out.println("this is private method ad can not be accessed outside class");
    }
}

class AnotherClass {

    public static void main(String[] args){
        PrivateAccessTest obj = new PrivateAccessTest();
        obj.test();
    }
}
