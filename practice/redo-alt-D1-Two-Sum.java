package practice;

import java.util.HashMap;

class redo_alt_D1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
            
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        redo_alt_D1_TwoSum Solution = new redo_alt_D1_TwoSum();
        
        int[] nums = { 2, 7, 11, 15};
        int target = 9;
        
        int[] result = Solution.twoSum(nums, target);
        
        System.out.println(result[0] + "," + result[1]);
    }
}