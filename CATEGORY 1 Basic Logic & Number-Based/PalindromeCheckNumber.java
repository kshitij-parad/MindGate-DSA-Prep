public class PalindromeCheckNumber {
    public static void main(String[] args) {
        int num = 10021;
        int temp = num;
        int rev = 0;

        while(num > 0){
            int digit = num % 10;
            rev = rev *  10 + digit;
            num /= 10;
        }

        if(rev == temp){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
