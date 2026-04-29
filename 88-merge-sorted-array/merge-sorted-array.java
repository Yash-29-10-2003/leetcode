class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] resArray = new int[m + n];
        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < m + n; i++) {
            if (pointer1 == m) {
                resArray[i] = nums2[pointer2];
                pointer2++;
            } else if (pointer2 == n) {
                resArray[i] = nums1[pointer1];
                pointer1++;
            } else if (nums1[pointer1] >= nums2[pointer2]) {
                resArray[i] = nums2[pointer2];
                pointer2++;
            } else {
                resArray[i] = nums1[pointer1];
                pointer1++;
            }
        }

        for (int j = 0; j < nums1.length; j++) {
            nums1[j] = resArray[j];
        }
    }
}