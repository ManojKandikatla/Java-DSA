public class MinNumDaysToMakeBouquets {

    public static boolean isPossible(int[]bloomDay,int m,int k,int day){
        int took=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                took++;
            }
            else{
                took=0;
            }
            if(took==k){
                m--;
                took=0;
            }
        }
        if(m<=0){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        int[] bloomDay={1,10,3,10,2};
        int m=2;
        int k=3;
        int l=1;
        int r=(int)Math.pow(10, 9);

        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay, m, k, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
