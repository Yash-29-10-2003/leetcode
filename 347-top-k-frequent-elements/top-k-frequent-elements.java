class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if (map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        //putting map entries into list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        //sorting list based on values in desc order
        list.sort((a, b) -> b.getValue() - a.getValue());
        //taking first k keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}