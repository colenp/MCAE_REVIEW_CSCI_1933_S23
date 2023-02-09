// This is a simple Java program.
// FileName : "Sudoku.java".
 
class Sudoku {
      int[][] grid1 = {
                {7, 8, 0, 4, 0, 0, 1, 2, 0},
                {6, 0, 0, 0, 7, 5, 0, 0, 9},
                {0, 0, 0, 6, 0, 1, 0, 7, 8},
                {0, 0, 7, 0, 4, 0, 2, 6, 0},
                {0, 0, 1, 0, 5, 0, 9, 3, 0},
                {9, 0, 4, 0, 6, 0, 0, 0, 5},
                {0, 7, 0, 3, 0, 0, 0, 1, 2},
                {1, 2, 0, 0, 0, 7, 4, 0, 0},
                {0, 4, 9, 2, 0, 6, 0, 0, 7}
        };
        int[][] grid2 = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
    static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("- - - - - - - - - - - - -");
            }
            for (int col = 0; col < board[0].length; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print(" | ");
                }
                if (col == 8) {
                    System.out.println(board[row][col]);
                } else {
                    System.out.print(board[row][col] + " ");
                }
            }
        }
    }

    static boolean valid(int[][] grid, int num, int[] pos) {
        // Check to see if the num and position are valid
        return false; 
    }

    static int[] findEmpty(int[][] grid) {
        // Return a tuple of (row, column) or NONE
        return new int[] {-1,-1};
    }

    static boolean solve(int[][] grid) {
        // Solve the grid, returning true or false
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Solving");
        printBoard(grid1);
        solve(grid1);
        System.out.println("solved");
        printBoard(grid1);

        System.out.println("Solving");
        printBoard(grid2);
        solve(grid2);
        System.out.println("solved");
        printBoard(grid2);

    } 
}