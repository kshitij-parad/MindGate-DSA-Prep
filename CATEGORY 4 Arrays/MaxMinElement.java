public class MaxMinElement {
    public static void main(String[] args) {
        int[] arr = {12,23,24,22,2};
        int min = arr[0] ;
        int max = arr[0];

        for(int i=1 ; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.printf("Min: %d\nMax:%d",min,max);
    }
}
