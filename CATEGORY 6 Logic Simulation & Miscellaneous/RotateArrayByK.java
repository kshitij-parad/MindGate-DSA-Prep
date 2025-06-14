
class RotateArrayByK {

    static int[] reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    static int[] rotateArrayByK(int[] arr, int k) {

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        arr = RotateArrayByK.rotateArrayByK(arr, k);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
