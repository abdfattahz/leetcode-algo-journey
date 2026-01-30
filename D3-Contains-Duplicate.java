import java.util.HashSet;

class D3_Contains_Dupe {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) {
                return true;
            } else {
                map.add(nums[i]);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        D3_Contains_Dupe solution = new D3_Contains_Dupe();
       
        int[] nums = {1,2,3,4};
        System.out.println(solution.containsDuplicate(nums));
    }
}