package JavaBasicProgrammingElements.Lab;

public class Ex3 {
    static class Demo {
        static void display() {
            System.out.println("Hiiii, How are you?");
        }
    }
    public static class Test {
        static void display() {
            System.out.println("I'm fine...");
        }

        public static void main(String[] args) {
            Demo demo = new Demo();
            Demo.display();

            Test test = new Test();
            Test.display();
        }
    }

}
