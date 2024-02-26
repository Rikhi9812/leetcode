package easy;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int sum = 0, temp = x;
        while(temp > 0){
            sum = 10 * sum + (temp % 10);
            temp = temp /10;
        }
        if(sum == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
}
