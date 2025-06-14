
public class SecondLargest {

    static int secondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        //12 , 23, 33, 303, 56, 57
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }

        if (sMax == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist.");
            return -1;
        }
        return sMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,5,5};
        System.out.println(SecondLargest.secondLargest(arr));
    }
}
