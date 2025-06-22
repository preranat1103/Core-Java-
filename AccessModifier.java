// 1) public – Accessible from anywhere
// 2) private – Accessible only within the same class
// 3) protected – Accessible within the same package and by subclasses
// 4)default (no modifier) – Accessible only within the same package

class AccessExample {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // default access (no keyword)

    public void showPublic() {
        System.out.println("Public Variable: " + publicVar);
    }

    private void showPrivate() {
        System.out.println("Private Variable: " + privateVar);
    }

    protected void showProtected() {
        System.out.println("Protected Variable: " + protectedVar);
    }

    void showDefault() {
        System.out.println("Default Variable: " + defaultVar);
    }

    public void accessPrivateFromSameClass() {
        showPrivate(); // accessing private method within same class
    }
}

public class Main {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        obj.showPublic();      //Accessible
        obj.showProtected();   //Accessible (same package)
        obj.showDefault();     //Accessible (same package)
        
        // obj.showPrivate(); //Error: Cannot access private method here

        obj.accessPrivateFromSameClass(); //Indirectly accessing private method
    }
}
