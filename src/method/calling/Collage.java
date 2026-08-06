package method.calling;

public class Collage {
    void collageName(){
        System.out.println("Rajarshri Shahu Mahavidyalaya");
    }

    void studentCount(int count){
        System.out.println("Student : "+count);
    }

    int getDepartment(){
        return 5;
    }

    int addDepartment(int extra){
        int add = 5 + extra;
        return add;
    }

    public static void main(String[] args){
        Collage c = new Collage();
        c.collageName();
        c.studentCount(800);
        int department = c.getDepartment();
        System.out.println("Departments : "+department);
        int addD = c.addDepartment(2);
        System.out.println("Total Department : "+addD);
    }

}
