// 52. N-Queens II
class Solution {
    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];
        return solve(0, n, cols, diag1, diag2);
    }
    private int solve(int row, int n, boolean[] cols,boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {
            if (cols[col] ||
                diag1[row + col] ||
                diag2[row - col + n - 1]) {
                continue;
            }
            cols[col] = true;
            diag1[row + col] = true;
            diag2[row - col + n - 1] = true;
            count += solve(row + 1, n, cols, diag1, diag2);
            cols[col] = false;
            diag1[row + col] = false;
            diag2[row - col + n - 1] = false;
        }
        return count;
    }
}
