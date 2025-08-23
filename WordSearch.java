class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];

        // try starting from every cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (fun(i, j, 0, used, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    // check validity
    public static boolean isValid(int row, int col, char[][] board, boolean[][] used, int start, String word) {
        return row >= 0 && row < board.length &&
               col >= 0 && col < board[0].length &&
               !used[row][col] &&
               board[row][col] == word.charAt(start);
    }

    public static boolean fun(int row, int col, int start, boolean[][] used, char[][] board, String word) {
        // base: if full word matched
        if (start == word.length()) {
            return true;
        }

        // check validity
        if (!isValid(row, col, board, used, start, word)) {
            return false;
        }

        // choose
        used[row][col] = true;

        // explore 4 directions
        boolean found = fun(row + 1, col, start + 1, used, board, word) ||
                        fun(row - 1, col, start + 1, used, board, word) ||
                        fun(row, col + 1, start + 1, used, board, word) ||
                        fun(row, col - 1, start + 1, used, board, word);

        // backtrack
        used[row][col] = false;

        return found;
    }
}
