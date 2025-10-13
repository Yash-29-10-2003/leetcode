class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length ; i++){
            int diff = target - nums[i];
            if (numMap.containsKey(diff)){
                res[0] = i;
                res[1] = numMap.get(diff);
                return res;
            }
            else{
                numMap.put(nums[i], i);
            }
        }
        return res;
    }
}