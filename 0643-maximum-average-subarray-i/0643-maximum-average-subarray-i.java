class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        // Calculate sum of first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        
        //  Sliding window
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        //  Return average
        return (double) maxSum / k;
    }
}