package array;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int perm = nums[i];
            ans[i] = nums[perm];
        }
        return ans;
    }
}
