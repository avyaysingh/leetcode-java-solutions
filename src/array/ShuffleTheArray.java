package array;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0, j = n,index = 0; index < ans.length; i++, j++){
            ans[index++] = nums[i];
            ans[index++] = nums[j];
        }
        return ans;
    }
}
