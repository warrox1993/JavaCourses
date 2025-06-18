package Boucles.While;

public class Palydrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(-12321)); // Negative numbers are not considered palindromes
        System.out.println(isPalindrome(0)); // 0 is a palindrome
        System.out.println(isPalindrome(1)); // Single digit numbers are palindromes
        System.out.println(isPalindrome(10)); // 10 is not a palindrome
        System.out.println(isPalindrome(1001)); // 1001 is a palindrome
        System.out.println(isPalindrome(-1234321)); // Negative numbers are not considered palindromes
        System.out.println(isPalindrome(123456789)); // Not a palindrome


    }

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        number = Math.abs(number); // Math.abs renvoie la valeur abosolue d'un nombre.
        int reverse =0;

        while (number >0){
            int lastDigit = number %10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        } return Math.abs(originalNumber) == reverse;
    }
}
