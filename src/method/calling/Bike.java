package method.calling;

public class Bike {
    void bikeName(){
        System.out.println("NS 400Z");
    }

    void bikeColour(){
        System.out.println("Red");
    }

    void bikestart() {
        System.out.println("Bike is starting");
    }

    void bikeride(){
        System.out.println("Bike is running");
    }


    public static void main(String[] args){
        Bike b = new Bike();
        b.bikeName();
        b.bikeColour();
        b.bikestart();
        b.bikeride();
    }



}









