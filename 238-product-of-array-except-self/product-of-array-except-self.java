class Solution {
    public int[] productExceptSelf(int[] nums) {
        // [1,2,3,4,5]
        // [120, 60, 40, 30, 24]
        int[] res = new int[nums.length];
        int product = 1;
        //suffix array prep
        for (int i = 0; i < nums.length ; i ++){
            res[i] = product;
            product*=nums[i];
        }

        //multiplying with all prefixes now
        product = 1;
        for(int j = nums.length -1 ; j>= 0 ; j--){
            res[j]*= product;
            product *= nums[j];
        }
        return res;
    }
}