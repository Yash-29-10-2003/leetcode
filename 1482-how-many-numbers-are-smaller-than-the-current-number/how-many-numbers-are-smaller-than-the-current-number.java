class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] originalNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (map.containsKey(nums[i])){
                continue;
            }
            else{
                map.put(nums[i] , i);
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            res[i] = map.get(originalNums[i]);
        }

        return res;
    }
}