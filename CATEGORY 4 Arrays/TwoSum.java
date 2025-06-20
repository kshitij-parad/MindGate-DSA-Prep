import java.util.HashMap;
class TwoSum{
	static int[] twoSum(int[] arr, int target){
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i =0 ; i < arr.length; i++){
			int comp = target - arr[i];
			
			if(hm.containsKey(comp)) {
				return new int[] {hm.get(comp), i};
			}

			hm.put(arr[i], i);
		}
		
	return new int[] {-1,-1};
	}
	public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}