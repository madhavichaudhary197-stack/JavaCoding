package method.calling;

public class Calculator {
    void message(){
        System.out.println("Welcome to Calculator");
    }
    void displayNum(int num){
        System.out.println("Number : "+num);
    }
    int getValue(){
        return 100;
    }
    int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.message();
        cal.displayNum(111);
        int i = cal.getValue();
        System.out.println("Value : "+i);

        int sum = cal.add(12, 19);
        System.out.println("Addition :"+sum);
    }

}
