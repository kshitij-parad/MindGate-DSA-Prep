public class SumOfDigitInNumber {

    static int sumOfDigitInNumber(int num){

        int res = 0;

        while(num  >0 ){
            int digit = num % 10;
            res += digit;
            num /=10; 
        }
        return res;
    }
    public static void main(String[] args) {
        
        System.out.println(SumOfDigitInNumber.sumOfDigitInNumber(101));

    }
}
