package Boucles.While;

public class AdditionDigit {
    public static void main(String[] args) {
        System.out.println(sumDigits(12345)); // Output: 15
        System.out.println(sumDigits(0));      // Output: 0
        System.out.println(sumDigits(-123));   // Output: -1 (invalid input)
        System.out.println(sumDigits(9876));   // Output: 30
    }
    public static int sumDigits(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add it to the sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
