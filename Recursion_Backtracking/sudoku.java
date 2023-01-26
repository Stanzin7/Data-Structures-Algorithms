package Recursion_Backtracking;

public class sudoku {
	

	class Solution {
		static int [][] b;
		
		public void solveSudoku(char[][] board) {
			char [][] b = sudokoSolver(board, 0, 0);
			for (int i = 0; i <b.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					System.out.println(b[i][j]);
				}
			}
		}

		static char[][] ans = new char[9][9];

		public static char [][] sudokoSolver(char[][] grid, int row, int col) {
			if (col >= 9) {
				col = 0;
				row += 1;
			}
			if (row >= 9) {
//				display(grid);
				return grid;
			}
			if (grid[row][col] != '.') {
				sudokoSolver(grid, row, col + 1);
			} else {
				for (int val = 1; val <= 9; val++) {
					if (isitPossible(grid, row, col, val) == true) {
						grid[row][col] = (char) (val + '0');
						sudokoSolver(grid, row, col + 1);
						grid[row][col] = '.';
					}
				}
			}
			return null;
		}

		public static void display(char[][] grid) {
			
			b = new int[grid.length][grid.length];
			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					b[i][j] = grid[i][j];
				}
			}
		}

		public static boolean isitPossible(char[][] grid, int row, int col, int val) {

			// row

			for (int c = 0; c < 9; c++) {
				if (grid[row][c] == (char) (val + '0')) {
					return false;
				}
			}
			// col

			for (int r = 0; r < 9; r++) {
				if (grid[r][col] == (char) (val + '0')) {
					return false;
				}
			}

			// 3*3
			int r = row - row % 3;
			int c = col - col % 3;

			for (int i = r; i < r + 3; i++) {
				for (int j = c; j < c + 3; j++) {
					if (grid[i][j] == (char) (val + '0')) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
