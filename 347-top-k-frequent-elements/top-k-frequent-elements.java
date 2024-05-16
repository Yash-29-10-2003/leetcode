class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            //this get or default function either gets the value from the map and
            // if the key doesnt exist yet it gives a default val of 0 .
        }

        HashMap<Integer, List<Integer>> freqMap = new HashMap<>();

        // for each num in the key set of the old mapwe check its 
        // frequency and add it as a key in 
        // the freq map , then we add the num in the value list
        for (int num : hashMap.keySet()) {
            int freq = hashMap.get(num);
            //we add freq in freqmap if not already present
            if (!freqMap.containsKey(freq)) {
                freqMap.put(freq, new ArrayList<>());
            }
            freqMap.get(freq).add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int freq = nums.length; freq > 0; freq--) {
            if (freqMap.containsKey(freq)) {
                result.addAll(freqMap.get(freq));
            }
        }
        
        int[] resultArray = new int[Math.min(k, result.size())];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}