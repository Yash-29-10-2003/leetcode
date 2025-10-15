class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String , Integer> mapA = new HashMap<>();
        HashMap<String , Integer> mapB = new HashMap<>();
        String[] sArray = s.split("");
        String[] tArray = t.split("");
        for(int i = 0; i < sArray.length ; i++){
            if (mapA.containsKey(sArray[i])){
                mapA.put(sArray[i], mapA.get(sArray[i]) + 1);
            }
            else {
                mapA.put(sArray[i] , 1);
            }
        }
        for(int i = 0; i < tArray.length ; i++){
            if (mapB.containsKey(tArray[i])){
                mapB.put(tArray[i] , mapB.get(tArray[i]) + 1);
            }
            else {
                mapB.put(tArray[i] , 1);
            }
        }
        if(mapA.equals(mapB)){
            return true;
        }
        return false;
    }
}