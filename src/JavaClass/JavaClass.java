package JavaClass;

public class JavaClass {

    // 1. Person.java
    public class person {
        String name;
        int age;
    }

    // 2. Student.java
    public class student extends person {
        public static Object student;
        int rollNo;
    }

    // 3. Teacher.java
    public class Teacher extends person {
        String subject;
    }

    // 4. Principal.java
    public class Principal extends person {
        int experience;
    }

    // 5. Course.java
    public class Course {
        String courseName;
        int duration;
    }

    // 6. Classroom.java
    public class Classroom {
        int roomNo;
        int capacity;
    }

    // 7. Library.java
    public class Library {
        String libraryName;
    }

    // 8. Book.java
    public class Book {
        String title;
        String author;
    }

    // 9. Exam.java
    public class Exam {
        String examName;
        int marks;
    }

    // 10. School.java
    public class School {
        String schoolName;
        String address;
    }



}

