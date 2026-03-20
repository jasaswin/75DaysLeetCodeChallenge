class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 0; // index of last unique element

        for (int k = 1; k < nums.length; k++) {

            // if new unique element found
            if (nums[j] < nums[k]) {

                // move unique element to next position
                nums[j + 1] = nums[k];
                j++;
            }
        }

        // number of unique elements
        return j + 1;
    }
}
