package method.calling;

public class Employee {
    void empName() {
        String name = "Madhavi Chaudhary ";
        System.out.println("Employee Name :" + name);
    }

    void empID(int id) {
        System.out.println("Employee ID :" + id);
    }

    double getSalary(){
        return 70000;
    }

    double bonus(double bonus){
        return 5000;
    }


    public static void main(String[] args){
        Employee emp = new Employee();
        emp.empName();
        emp.empID(101);
        double s = emp.getSalary();
        System.out.println("Salary : "+s);
        double b = emp.bonus(5000);
        double totalSalary = s + b;
        System.out.println("Total Salary : "+totalSalary);
    }

}
