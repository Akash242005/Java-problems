public class NQueen {
    static int N = 4;

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (solveNQueen(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
    static boolean solveNQueen(int[][] board, int row) {
        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (solveNQueen(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }
    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
    }
}
