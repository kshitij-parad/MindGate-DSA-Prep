
public class PrintHalfPyramidofNumbers {
    static void printHalfPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        PrintHalfPyramidofNumbers.printHalfPyramid(5);
    }
}
