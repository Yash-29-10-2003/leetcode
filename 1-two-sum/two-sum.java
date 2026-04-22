class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int len = nums.length;
        int[] res = {0,0};
        for(int i = 0 ; i<len ; i++){
            if (numMap.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = numMap.get(target - nums[i]);
                return res;
            }
            else{
                numMap.put(nums[i],i);
            }
        }
        return res;
    }
}