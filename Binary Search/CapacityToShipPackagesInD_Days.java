public class CapacityToShipPackagesInD_Days {
    public static boolean isPossible(int[] weights,int days,int k){
        int temp=0;
        for(int i=0;i<weights.length;i++){
            int val=weights[i];

            if(val>k){
                return false;
            }
            if(temp+val>k){
                days--;
                temp =0;
            }
            temp+=val;
            if(days==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[] weights={1,2,3,1,1};
        int days=4;
        int l=0;
        int r=Integer.MAX_VALUE;
        while (l<=r) {
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
