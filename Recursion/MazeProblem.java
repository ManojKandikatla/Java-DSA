import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {

        System.out.println(count(3, 3));//need to find all the possable paths for 3,3 matrix ans will be 6

       paths("", 3, 3);//for everypath it is gona print the direction

        System.out.println(pathsInList("", 3, 3)); //printing in array list

        System.out.println(pathsInDiagonal("", 3, 3));//printing in vertical(v), horizontal(h),diagonal(d);

        boolean[][] board= {

            {true,true,true},
            {true,false,true},//false is an obstical in [3][3] borad
            {true,true,true},
        };
        pathRestrictions("", board, 0, 0);
    }
    static int count(int r, int c){
        if(r ==1 || c == 1){
            return 1;
        }
        //only need to move right and left 
        int left = count(r-1, c);//row decreases  by one 
        int right = count(r, c-1);//column deceases by  one
        return left + right;
    }
    //printing paths
    static void paths(String p, int r, int c ){
        if(r  == 1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            paths(p+'D', r-1, c);
        }
        if(c> 1){
            paths(p+'R', r, c-1);
        }
    }

    static ArrayList <String> pathsInList(String p, int r, int c){
        if(r  == 1 && c==1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList <String> list = new ArrayList<>();
        if(r > 1){
           list.addAll(pathsInList(p+'D', r-1, c)) ;
        }
        if(c> 1){
           list.addAll(pathsInList(p+'R', r, c-1));
        }
        return list;
    }

    static ArrayList <String> pathsInDiagonal(String p, int r, int c){
        if(r  == 1 && c==1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList <String> list = new ArrayList<>();
        if(r > 1){
           list.addAll(pathsInDiagonal(p+'V', r-1, c)) ;
        }
        if(c> 1){
           list.addAll(pathsInDiagonal(p+'H', r, c-1));
        }
        if(r>1 && c>1){
            list.addAll(pathsInDiagonal(p+'D', r-1, c-1));
        }
        return list;
    }

    //paths with restrictions
     static void pathRestrictions(String p,boolean[][] maze, int r, int c ){
        //here index numers are dierent it starts form 0,0 to maze.length andhuke if condition attla rasinam
        if(r  == maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            //if the condition is not false it means true
            return;
        }
        if(r < maze.length-1){
            pathRestrictions(p+'D',maze, r+1, c);
        }
        if(c < maze[0].length-1){
            pathRestrictions(p+'R',maze, r, c+1);
        }
    }
}


