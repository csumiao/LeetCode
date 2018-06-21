package code1;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                int c = nums[i] + nums[j];
                if(c == target) {
                    return new int [] {i, j};
                }
            }
        }
        return null;
    }
}
