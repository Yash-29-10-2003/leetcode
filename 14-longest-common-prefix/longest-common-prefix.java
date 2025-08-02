class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String currentStr = strs[i];
            int j = 0;
            while (j < commonPrefix.length() && j < currentStr.length()
                    && commonPrefix.charAt(j) == currentStr.charAt(j)) {
                j++;
            }
            commonPrefix = commonPrefix.substring(0, j);
            if (commonPrefix.isEmpty()) return "";
        }

        return commonPrefix;
    }
}
