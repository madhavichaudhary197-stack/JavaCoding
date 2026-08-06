package JavaBasicProgrammingElements.Lab;

public class Ex5 {

    class ClassA {
        public static void main(String[] args){
            System.out.println("This is the main method of ClassA.");
        }
    }
    public class ClassB {
        public static void main(String[] args){
            System.out.println("This is the main method of ClassB.");
            System.out.println("Calling ClassA's is main method...");
            ClassA.main(args);
        }

    }

}
