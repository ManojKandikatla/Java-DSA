import java.util.*;
import java.util.Arrays;
public class TwoDArr{
    public static void main(String[]args){
        // int[][] arr ={{2,3,5},{6,7,9}};
        // int r=arr.length;
        // int c=arr[0].length;
        
        // for(int i=0;i<r;i++){
        //     int j = c-i-1;
        //    System.out.println(arr[i][j]);
        // }
        // System.out.println(arr[0][1]);
        
        // System.out.println("rows:-"+r+" columns-"+c);


        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];//row and column

        //input
        System.out.print("Enter values: ");
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col< arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output

        //  for(int row = 0; row <arr.length; row++){
        //     for(int col = 0; col< arr[row].length;col++){
        //        System.out.println(arr[row][col]);
        //     }
        //     System.out.println();
        // }

        //optimized

        // for(int row = 0; row <arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //enhanced
        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
 