class Solution {
    public int maxSubArray(int[] nums) {
        //This is apparently called kadanes algorithm
        int currSum = nums[0];
        int largestSum = nums[0];

        for(int i = 1; i < nums.length ; i++){
            currSum = Math.max(nums[i] , nums[i] + currSum);
            largestSum = Math.max(currSum , largestSum);
        }

        return largestSum;
    }
}