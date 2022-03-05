package array;

public class NumberSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Arrays.sort(nums);
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){

                if(nums[j] < nums[i]){
                    count++;
                }

            }
            result[i] = count;
        }
        return result;
    }
}
