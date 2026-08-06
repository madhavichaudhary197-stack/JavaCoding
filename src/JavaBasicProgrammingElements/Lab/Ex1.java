package JavaBasicProgrammingElements.Lab;

public class Ex1 {
    static class CallMethod {
        void hello() {
            System.out.println("Hello");
        }

        void show() {
            hello();
            System.out.println("Show Method");
        }

        public static void main(String[] args) {
            CallMethod obj = new CallMethod();
            obj.show();
        }
    }

}
