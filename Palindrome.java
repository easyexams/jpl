import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = input.nextLine();
        if (isPalindrome(s))
            System.out.println("String " + s + " is palindrome");
        else
            System.out.println("String " + s + " is not palindrome");
    }

    public static boolean isPalindrome(String s1) {
        int low = 0;
        int high = s1.length() - 1;
        while (low < high) {
            if (s1.charAt(low) != s1.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
