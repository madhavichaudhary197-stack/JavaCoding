package method.calling;

public class City {
    void cityName(){
        System.out.println("City Name: Latur");
    }

    void stateName(){
        System.out.println("State Name: Maharashtra");
    }

    public static void main(String[] args ){
        City c = new City();
        c.cityName();
        c.cityName();
    }
}
