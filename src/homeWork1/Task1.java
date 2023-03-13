package homeWork1;

public class Task1 {
//    Palindrome Number
//    Given an integer x, return true if x is a palindrome, and false otherwise.


    public static void main(String[] args) {
        int x = 292;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
