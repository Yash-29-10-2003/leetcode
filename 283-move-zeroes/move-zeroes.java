class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        while(left < right && right < nums.length){
            if (nums[left] == 0 && nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left += 1;
                right += 1;
            } else if (nums[left] == 0 && nums[right] == 0){
                right +=1;
            } else if(nums[left] != 0 && nums[right] !=0){
                left += 1;
                right += 1;
            } else if(nums[left] != 0 && nums[right] == 0){
                left += 1;
                right += 1;
            }
        }
    }
}