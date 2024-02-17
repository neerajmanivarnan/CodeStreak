import java.util.Scanner;

public class day14q3sol2 {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        if (solveSudoku(grid)) {
            
            printGrid(grid);
        } else {
            System.out.println("No solution found");
        }
    }

    private static boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValid(row, col, num, grid)) {
                            grid[row][col] = num;
                            if (solveSudoku(grid)) {
                                return true;
                            } else {
                                grid[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int row, int col, int num, int[][] grid) {
        
        for (int i = 0; i < GRID_SIZE; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        
        int subgridRow = row / 3;
        int subgridCol = col / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[subgridRow * 3 + i][subgridCol * 3 + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printGrid(int[][] grid) {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
