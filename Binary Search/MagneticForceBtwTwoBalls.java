import java.util.Arrays;
public class MagneticForceBtwTwoBalls {
    public static  boolean isPossible(int[]position,int m,int k){
        int prev =position[0];
        for(int i=1;i<position.length;i++){
            int val =position[i];
            if(val-prev>=k){
                m--;
                prev =val;
            }
            if(m<=0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] position={5,4,3,2,1,1000000000};
        Arrays.sort(position);
        int m = 2;
        int l=1;
        int r =(int)Math.pow(10, 9);
        while(l<=r){
            int mid= l+(r-l)/2;
            if(isPossible(position,m,mid)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.println(l);
    }
}