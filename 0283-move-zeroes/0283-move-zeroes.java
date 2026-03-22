class Solution {
    public void moveZeroes(int[] num) {

        int index = 0; // position to place next non-zero

        // move all non-zero elements to the front
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[index] = num[i];
                index++;
            }
        }

        // fill remaining positions with zero
        while (index < num.length) {
            num[index] = 0;
            index++;
        }
    }
}
