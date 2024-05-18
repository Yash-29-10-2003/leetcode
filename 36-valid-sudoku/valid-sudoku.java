class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
    public int[] fixInput(char[] charNums){
        for (int i = 0; i < charNums.length; i++) {
            if (charNums[i] == '.') {
                charNums[i] = '0';
            }
        }
        int[] intArray = new int[charNums.length];
        for (int i = 0; i < charNums.length; i++) {
            intArray[i] = Character.getNumericValue(charNums[i]);
        }
        return intArray;
    }
    public int[] getSubgrid(char[][] board, int row, int col) {
        char[] subgridString = new char[9];
        int index = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                subgridString[index++] = board[i][j];
            }
        }
        return fixInput(subgridString);
    }
    public boolean isValidSudoku(char[][] board) {
        //Checking rows
        for (char[] row : board) {
            int[] cleanedNums = fixInput(row);
            if (containsDuplicate(cleanedNums)) {
                return false;
            }
        }
        // Checking columns
        for (int col = 0; col < board[0].length; col++) {
            char[] column = new char[board.length];
            for (int row = 0; row < board.length; row++) {
                column[row] = board[row][col];
            }
            int[] cleanedNums = fixInput(column);
            if (containsDuplicate(cleanedNums)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (containsDuplicate(getSubgrid(board, i, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}