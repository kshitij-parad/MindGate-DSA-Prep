import java.util.Arrays;

public class ReverseArray {

    static int[] reverseArray(int[] arr){
        int s = 0;
        int l = arr.length-1;
        int temp;

        while(s<l){
            temp = arr[s];
            arr[s] = arr[l];
            arr[l] = temp;

            s++;
            l--;
        }

        return  arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(ReverseArray.reverseArray(arr)));
    }
}
