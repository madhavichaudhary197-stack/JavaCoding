package method.calling;

public class Laptop {
    void brand(){
        System.out.println("HP");
    }

    void price(double p){
        System.out.println("price : "+p);
    }

    int getRam(){
        return 8;
    }

    int totalRam(int extraRam){
        int r = 8 + extraRam;
        return r;
    }


    public static void main(String[] args){
        Laptop l = new Laptop();
        l.brand();
        l.price(55000);
        int ram = l.getRam();
        System.out.println("RAM = "+ram+"GB");
        int extra = l.totalRam(8);
        System.out.println("Total RAM = "+extra+"GB");
    }
}
