public class IsNumberPrime {

    static boolean isPrime(int num){

        if(num == 1) return false;


        //--Correct but less optimal

        // for(int i = 2; i< num -1 ; i++){
        //     if(num % i == 0) return  false;
        // }

        //More optimal
        for(int i = 2; i<= Math.sqrt(num) ; i++){
            if(num % i == 0) return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        boolean res = IsNumberPrime.isPrime(11);
        System.out.println(res);
    }
}
