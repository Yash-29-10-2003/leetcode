class Solution {
    public boolean isAnagram(String s, String t) {

        // Converting string to character array
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sorting the arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        //String sSorted = new String(sArray);
        //String tSorted = new String(tArray);

        return Arrays.equals(sArray, tArray);
    }
}