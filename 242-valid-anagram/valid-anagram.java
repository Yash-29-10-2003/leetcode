class Solution {
    public boolean isAnagram(String s, String t) {
        int[] scount = new int[26];
        int[] tcount = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char c : sArray){
            scount[c - 'a'] += 1;
        }
        for(char d : tArray){
            tcount[d - 'a'] += 1;
        }

        return Arrays.equals(scount, tcount);
    }
}