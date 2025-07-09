class Student {
    int rollNo;
    String name;

    // Constructor 1 - No parameters
    Student() {
        System.out.println("Default constructor called");
    }

    // Constructor 2 - One parameter
    Student(int r) {
        rollNo = r;
        System.out.println("Roll No: " + rollNo);
    }

    // Constructor 3 - Two parameters
    Student(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Student s1 = new Student();                    // Calls Constructor 1
        Student s2 = new Student(101);                 // Calls Constructor 2
        Student s3 = new Student(102, "Prerana");      // Calls Constructor 3
    }
}
