class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //we have a map where we store sorted strings as keys and add the relevant strings
        //as values to it , then in the end we just return  out all the values as
        //a list of list
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] currArray = strs[i].toCharArray();
            Arrays.sort(currArray);
            String currSorted = new String(currArray);
            
            if (hashMap.containsKey(currSorted)) {
                hashMap.get(currSorted).add(strs[i]);
            } else {
                List<String> currVals = new ArrayList<>();
                currVals.add(strs[i]);
                hashMap.put(currSorted, currVals);
            }
        }
        return new ArrayList<>(hashMap.values());
    }
}