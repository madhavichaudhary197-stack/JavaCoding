package ConditionalStatements;

public class MoreIfElsePractice {

    //Size 28 = xs
    //Size 30 = Small
    //Size 32 = Size M
    //Size 34 = Size is L
    //Size 36 = Size is XL
    //Size 38 = Size is XXL
    //Size please provide correct size

    public static void main(String[] args) {
        int size = 34;

        if(size == 28) {
            System.out.println("Size is Extra Small");
        }else if (size == 30) {
            System.out.println("Size is Small");
        }else if (size == 32) {
            System.out.println("Size is Medium");
        } else if (size == 34) {
            System.out.println("Size is Large");
        } else if (size == 36) {
            System.out.println("Size is Extra Large");
        } else if (size == 38) {
            System.out.println("Size is Double Extra Large");
        } else {
            System.out.println("please provide correct size");
        }

    }
}
