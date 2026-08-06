package method.calling;

public class Book {
    void bookName() {
        System.out.println("Python");
    }

    void bookprice(int price) {
        System.out.println("price : " + price);
    }

    int getPages() {
        return 300;
    }

    int addPages(int add) {
        int a = 300 + add;
        return a;
    }


    public static void main(String[] args) {
        Book java = new Book();
        java.bookName();
        java.bookprice(500);
        int pages = java.getPages();
        System.out.println("Pages: " + pages);
        int totalpages = java.addPages(50);
        System.out.println("Total Pages : " + totalpages);
    }
}

