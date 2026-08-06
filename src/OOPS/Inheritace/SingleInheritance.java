package OOPS.Inheritace;

    class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}


class vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class car extends vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}


class person {
    void display() {
        System.out.println("Person details");
    }
}
class Student extends person {
    void study() {
        System.out.println("Student is studying");
    }
}


class Bird {
    void fly(){
        System.out.println("Bird can fly");
    }
}
class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow chirps");
    }
}


class Shape {
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of circle");
    }
}


class Employee {
    void work(){
        System.out.println("Empoyee works");
    }
}
class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages");
    }
}

class Mobile {
    void call() {
        System.out.println("Calling");
    }
}
class Smartphone extends Mobile{
    void camera() {
        System.out.println("Taking photo");
    }
}


class Book {
    void read() {
        System.out.println("Reading book");
    }
}
class Notebook extends Book {
    void write(){
        System.out.println("writing notes");
    }
}


class Bank {
    void account() {
        System.out.println("Bank account");
    }
}
class SBI extends Bank {
    void loan() {
        System.out.println("SBI provides loan");
    }
}

class Fruit {
    void taste() {
        System.out.println("Fruit is tasty");
    }
}
class Mango extends Fruit {
    void color() {
        System.out.println("Mango is Yellow");
    }
}
