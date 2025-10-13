class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        int[] cursor = Arrays.copyOf(points[0], 2);
        for (int i = 1; i < points.length; i++) {
            while (cursor[0] != points[i][0] || cursor[1] != points[i][1]) {
                if (cursor[0] < points[i][0]) cursor[0]++;
                else if (cursor[0] > points[i][0]) cursor[0]--;

                if (cursor[1] < points[i][1]) cursor[1]++;
                else if (cursor[1] > points[i][1]) cursor[1]--;

                count++;
            }
        }
        return count;
    }
}