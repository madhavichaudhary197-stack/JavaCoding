package method.calling;

public class Mobile {
    void Mobile() {
        System.out.println("Onepluse ");
    }

    void mobilePrice(int price) {
        System.out.println("Price : " + price);
    }

    int getStorage(){
        return 128;
    }

    int addStorage(int extraStorage){
        int s = 128 + extraStorage;
        return s;
    }




    public static void main(String[] args){
        Mobile m = new Mobile();
        m.Mobile();
        m.mobilePrice(35000);
        int storage = m. getStorage();
        int totalStorage = m.addStorage(128);
        System.out.println("Total Storage = "+totalStorage+"GB");

    }

}
