
public class PrimeNumbersInRange {

    static void printPrimeNumInRange(int start, int end) {

        
        
        // 10 - 20 : 11, 13 , 17, 19
        for (int i = start; i < end; i++) {

            if( i < 2) continue;;

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        PrimeNumbersInRange.printPrimeNumInRange(10, 30);
    }
}
