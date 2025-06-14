
public class RemoveDuplicate {

    static boolean findElement(int[] arr, int key,int index){
        for(int i = 0 ; i< index ; i++){
            if(arr[i] == key){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12,23,44,23,12,44};
        int[] temp = new int[arr.length]; //12, 23, 44,
        int index = 0;
        for(int i =0 ; i<arr.length;i++){

            if(findElement(temp, arr[i], index) == false){
                temp[index] = arr[i];
                index++;
            }
        }

        for(int i =0 ; i < index; i++){
            System.out.print(temp[i] +" ");
        }
    }
}
