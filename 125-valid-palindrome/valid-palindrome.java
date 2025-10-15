class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);

            // skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(lChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rChar)) {
                right--;
                continue;
            }

            // compare ignoring case
            if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
