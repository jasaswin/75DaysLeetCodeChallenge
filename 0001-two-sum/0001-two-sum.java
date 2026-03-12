class Solution {
    public int[] twoSum(int[] num, int targets) {

        
        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if (num[i] + num[j] == targets) {
                    return new int[] { i, j };
                }
            }
        }

        
        return new int[] {};
    }
}



