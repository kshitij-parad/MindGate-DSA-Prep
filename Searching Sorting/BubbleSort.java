public class BubbleSort {

    static void bubbleSort(int[] arr){
        int temp;

        //2,18,2,3,6,1

        for(int i = 0 ; i < arr.length-1;i++){
            boolean swapped = false;
            for(int j = 0 ; j < arr.length-1-i; j++){
                
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                     arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }

            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,18,2,3,6,1};

        BubbleSort.bubbleSort(arr);

        for(int e : arr)
            System.out.println(e);
    }
}
