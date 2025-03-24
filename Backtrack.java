import java.util.ArrayList;
import java.util.List;

class Backtrack {
    
    // Function to check if it's safe to place a queen
    public static boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Check upper diagonal (↖)
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check left side (←)
        for (int j = col; j >= 0; j--) {
            if (board[row][j] == 'Q') return false;
        }

        // Check lower diagonal (↙)
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Saves the board configuration
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (char[] row : board) {
            newBoard.add(new String(row));
        }
        allBoards.add(newBoard);
    }

    // Backtracking helper function
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        int n = board.length;
        if (col == n) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Function to solve the N-Queens problem
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4;  // Change this for different board sizes
        List<List<String>> solutions = solveNQueens(n);

        // Print all solutions
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
