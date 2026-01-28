class D2_Best_Time_To_Buy {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            int tempProfit = prices[i] - minPrice;            
            
            if (tempProfit > maxProfit) {
                maxProfit = tempProfit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        D2_Best_Time_To_Buy solution = new D2_Best_Time_To_Buy();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        
        System.out.println(solution.maxProfit(prices1));
        System.out.println(solution.maxProfit(prices2));
    }
}
