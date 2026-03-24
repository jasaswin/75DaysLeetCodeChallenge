class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0; // index of last unique element

        for (int j = 1; j < nums.length; j++) {

            // if new unique element found
            if (nums[i] < nums[j]) {

                // move unique element to next position
                nums[i + 1] = nums[j];
                i++;
            }
        }

        // number of unique elements
        return i+ 1;
    }
}
