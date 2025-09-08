//reverse for prefix
import java.util.Arrays;
public class SuffixArr {
    public static void main(String[] args) {
         int[] A = {1,2,3,4,5};
         int n= A.length;
         int[] SF = new int[n];
         SF[n-1]=A[n-1];
         for (int i = n-2; i>=0; i--) {
            SF[i]= SF[i+1]+A[i];
         } 
        System.out.println(Arrays.toString(SF));
    }
}
