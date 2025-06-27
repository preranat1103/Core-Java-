class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;  // 'this.name' is instance variable, 'name' is local parameter
    }

    void display() {
        System.out.println("Student name: " + this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Prerana");
        s1.display();
    }
}
