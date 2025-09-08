import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] mat= {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        System.out.println(Arrays.deepToString(mat));
        int n=mat.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(mat,i,j);
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }
    static void swap(int mat[][],int i,int j){
        int temp= mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
}