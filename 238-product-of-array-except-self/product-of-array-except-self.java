class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] resArray = new int[nums.length];
        Arrays.fill(resArray, 1);

        int leftMult = 1;
        for (int i = 0 ; i < nums.length ; i++){
            if (i == 0){
                resArray[i] = 1;
            } else {
                leftMult *= nums[i-1];
                resArray[i] *= leftMult;
            }
        }

        int rightMult = 1;
        for (int i = nums.length -1 ; i > -1 ; i--){
            if (i == nums.length -1){
                resArray[i] *= 1;
            } else {
                rightMult *= nums[i+1];
                resArray[i] *= rightMult;
            }
        }
        return resArray;
    }
}