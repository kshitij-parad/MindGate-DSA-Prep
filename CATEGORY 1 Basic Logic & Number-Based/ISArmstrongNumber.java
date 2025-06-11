public class ISArmstrongNumber {


    static int power(int base, int exp){
        int res = 1;

        while(exp> 0){
            res *= base;
            exp--; 
        }
        return  res;
    }

    public static void main(String[] args) {
        int num = 407;
        int n = 3;
        int temp = num;
         double sum = 0;


        

        // 153 = 27+ 125+1
        while(num > 0){
            int digit = num % 10;
            // sum = sum  + Math.pow(digit, n);
            sum = sum  + ISArmstrongNumber.power(digit, n);
            num /= 10; 

            //  System.out.println(digit +" "+ (digit^n) + " "+sum);
        }

        // System.out.println(sum);
        if(temp == sum){
            System.out.println("The number is Armstrong.");
        }
        else{
            System.out.println("The number is not Armstrong.");
        }
    }
}
