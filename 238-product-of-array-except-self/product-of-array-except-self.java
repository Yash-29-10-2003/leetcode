class Solution {
    public int[] productExceptSelf(int[] nums) {
        //we can think of the resultant array as for each array[i]
        //array[i] = Mult of right of Array[i] * Mult of left of Array[i]

        int[] resArray = new int[nums.length];
        Arrays.fill(resArray, 1);

        //multiplying every ele of the result array with ele's on its left side
        int leftMult = 1;
        for (int i = 0 ; i < nums.length ; i++){
            if (i == 0){
                resArray[i] = 1;
            } else {
                leftMult *= nums[i-1];
                resArray[i] *= leftMult;
            }
        }

        //multiplying every ele of the result array with ele's on its right side
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