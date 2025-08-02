class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String strNew = new String(strArray);
            map.putIfAbsent(strNew, new ArrayList<String>());
            map.get(strNew).add(str);
        }

        return new ArrayList<>(map.values());

    }
}