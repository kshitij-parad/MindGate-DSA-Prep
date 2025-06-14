import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {1,33,4,5,22,3,4,32};
        int k = 3;

        Arrays.sort(arr);

        for(int n: arr){
              System.out.print(n + " ");
            
        }
        System.out.println("\n"+arr[arr.length-k]);
    }    
}
