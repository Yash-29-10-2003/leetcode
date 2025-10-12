class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();
        ArrayList<Integer> numList = new ArrayList<>();

        for (int num : nums) {
            numSet.add(num);
        }
        for(int i = 1 ; i < nums.length + 1 ; i ++){
            if (numSet.contains(i)){
                continue;
            }
            else{
                numList.add(i);
            }
        }
        return numList;
    }
}