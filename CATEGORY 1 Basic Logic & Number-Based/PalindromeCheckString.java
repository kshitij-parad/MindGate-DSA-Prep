public class PalindromeCheckString {
    public static void main(String[] args) {
        
        String str = "  ";
        int s = 0;
        int l = str.length()-1;

        boolean flag = true;
        //madam
        while(s<l){
            if(str.charAt(s) != str.charAt(l)){
               flag = false;
                break;
            }
            s++;
            l--;
        }

        if(flag){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
