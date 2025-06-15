import java.util.Scanner;

class NumberChecker {
    int number;

    // Constructor
    NumberChecker(int num) {
        number = num;
    }

    // Function to check Armstrong number
    boolean isArmstrong() {
        int original = number;
        int result = 0;
        int temp = number;
        int digits = 0;

        // Count digits
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        return result == original;
    }

    // Function to check Palindrome number
    boolean isPalindrome() {
        int original = number;
        int reversed = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return reversed == original;
    }
}

public class ArmstrongPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Create object
        NumberChecker checker = new NumberChecker(num);

        // Check Armstrong
        if (checker.isArmstrong()) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        // Check Palindrome
        if (checker.isPalindrome()) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }

        sc.close();
    }
}
