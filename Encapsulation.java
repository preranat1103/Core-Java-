class Student {
    // Private data members
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setters
        s.setName("Prerana");
        s.setAge(21);

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
