class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] currArray = str.toCharArray();
            Arrays.sort(currArray);
            String key = new String(currArray);
            if(map.containsKey(key)){
                List<String> temp = map.get(key);
                temp.add(str);
                map.put(key,temp);
            }
            else{
                List<String> temp2 = new ArrayList<>();
                temp2.add(str);
                map.put(key, temp2);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}