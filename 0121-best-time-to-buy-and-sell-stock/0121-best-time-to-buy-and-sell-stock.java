class Solution {
    public int maxProfit(int[] price) {

        int minPrice = price[0]; // best buying price so far
        int maxProfit = 0;        // best profit so far

        for (int i = 1; i < price.length; i++) {

            // Update minimum price (buying day)
            if (price[i] < minPrice) {
                minPrice = price[i];
            }

            // Calculate profit if sold today
            int profit = price[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
