public class TestFinally {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;  // causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This is the finally block");
        }
    }
}
