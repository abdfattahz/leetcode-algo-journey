import java.util.Arrays;

class D5_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int leftProd = 1;
        int rightProd = 1;
        
        for (int i = 0; i < n; i++) {
            answer[i] = leftProd;
            leftProd = leftProd * nums[i];
        }

        for (int i = (n - 1); i >= 0; i--) {
            answer[i] = answer[i] * rightProd;
            rightProd = rightProd * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        D5_Product_of_Array_Except_Self Solution = new D5_Product_of_Array_Except_Self();
        
        int[] nums = {1,2,3,4};
        int[] result = Solution.productExceptSelf(nums);

        System.out.println(Arrays.toString(result));

    }
}