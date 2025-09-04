public class MinimizedMaxProductDistributedToStore {
    public static boolean isPossible(int n,int[]quantities,int limit){
        for(int i=0;i<quantities.length;i++){

        int val = quantities[i];
        int temp= val/limit;
        if(val%limit!=0){
            temp++;
        }
        n-=temp;
        if(n<0){
            return false;
        }
        }
        return true;
        
    }
    public static void main(String[]args){
        int n=6;
        int[] quantities={11,6};
        int l=1;
        int r= (int)Math.pow(10, 5);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(n, quantities, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
