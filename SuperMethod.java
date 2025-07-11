class Student {
    String name="Prerana";
}

class Student1 extends Student {
    String name="Vighnaharta";

    void print () {
    System.out.println("The First student name is " +super.name);
    System.out.println("The second student name is " +name);  
    }
}

public class Super2 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.print();
    }
}
