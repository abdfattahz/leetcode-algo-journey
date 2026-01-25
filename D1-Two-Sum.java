// if the class is set to `public`, the class name must match the file name
class D1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        D1_TwoSum sol = new D1_TwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.twoSum(nums, target);
        System.out.println("(" + result[0] + ", " + result[1] + ")");
    }
}