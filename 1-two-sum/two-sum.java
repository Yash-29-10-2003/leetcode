class Solution {
    public int[] twoSum(int[] nums, int target) {
        //we are just creating a hash map  where we store the value of parsed integer from the
        //list to check them later with other elements by seeing if 
        //target - futureELE = pastELE
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i =   0 ;  i < nums.length ; i++){
            int diff;
            diff =  target - nums[i];
            if (hashMap.containsKey(diff)){
                return new int[]{i,hashMap.get(diff)};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{0,1};
    }
}