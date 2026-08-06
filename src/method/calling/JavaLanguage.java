package method.calling;

public class JavaLanguage {
    void features(){
        System.out.println("Java is an object-oriented programming language.");
    }


    void version(){
        System.out.println("Java is widely used for software development.");
    }

    public static void main(String[] args){
        JavaLanguage j1 = new JavaLanguage();
        j1.features();
        j1.version();

    }
}

