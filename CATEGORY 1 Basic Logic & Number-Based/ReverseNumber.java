class ReverseNumber{
    public static void main(String[] args){

        int rev =0;
        int num = 1022;
        int digit;

        while(num > 0){
            digit = num %10;
            rev = rev * 10 + digit;
            num = num /10; 
        }

        System.out.println(rev);
      
    }
}