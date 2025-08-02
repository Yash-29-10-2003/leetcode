class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer1 = 0;
        int pointer2 = nums.length - 1;
        while (pointer1 <= pointer2) {
            if (nums[pointer1] == val) {
                nums[pointer1] = nums[pointer2];
                pointer2--;
            } else {
                pointer1++;
            }
        }

        return pointer2 + 1;
    }
}