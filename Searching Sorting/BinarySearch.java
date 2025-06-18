// package Searching Sorting;

public class BinarySearch {

    static int binarySearch(int[] arr, int key) {

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                h = mid - 1;
            }
             else {
                l = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 40};
        // int n = arr.length;
        int x = 10;
        int result = BinarySearch.binarySearch(arr, x);
        if (result == -1) {
            System.out.println(
                    "Element is not present in array"); 
        }else {
            System.out.println("Element is present at "
                    + "index " + result);
        }
    }
}
