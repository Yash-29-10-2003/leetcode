class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        int count = 0;
        for (String str : strs){
            String dummyStr = "";
            if (str.equals("")) {
                commonPrefix = "";
                break;
            }
            if (count == 0){
                commonPrefix = str;
                count += 1;
                continue;
            }
            for(int i = 0; i< str.length() ; i++){
                if (commonPrefix.length() <= i){
                    commonPrefix = dummyStr;
                    break;
                }
                if (str.charAt(i) == commonPrefix.charAt(i)){
                    dummyStr += str.charAt(i);
                }
                else{
                    commonPrefix = dummyStr;
                }
                if (i == str.length() - 1){
                    if (commonPrefix.length() > str.length()){
                        commonPrefix = dummyStr;
                    }
                }
            }
            
        }
        return commonPrefix;
    }
}