class MaxSubArray{

    static int maxSubArray(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i< arr.length; i++){
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum= Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {-1,-1,10,-1,-1};
        System.out.println(MaxSubArray.maxSubArray(arr));

    }
}