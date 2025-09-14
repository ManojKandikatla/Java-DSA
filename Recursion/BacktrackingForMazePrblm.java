public class BacktrackingForMazePrblm {
    
    public static void main(String[] args) {
        //you are making sum changes while going into below recursion calls, when you go outside of the recursion calls the changes that where made via those recursion calls should also not be available
        
          boolean[][] board= {

            {true,true,true},
            {true,true,true},//false is an obstical in [3][3] borad
            {true,true,true},
        };
        allPath("", board, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        // Base case: reached destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // If cell is blocked or already visited
        if (!maze[r][c]) {
            return;
        }

        // Mark cell as visited
        maze[r][c] = false;

        // Move Down
        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }

        // Move Right
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }

        // Move Up
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }

        // Move Left
        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }

        // Backtracking: Unmark cell as visited for other paths
        maze[r][c] = true;
    }
}


