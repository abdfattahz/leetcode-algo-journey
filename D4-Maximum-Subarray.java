// Kadane's algorithm
class D4_Max_Subarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int best = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            best = Math.max(best, currentSum);
        }
        return best;
    }
    
    public static void main(String[] args) {
        D4_Max_Subarray solution = new D4_Max_Subarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        
        System.out.println(solution.maxSubArray(nums));
    }
}