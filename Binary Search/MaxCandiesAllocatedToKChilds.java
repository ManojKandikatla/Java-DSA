public class MaxCandiesAllocatedToKChilds {
    public static boolean isPossible(int[] candies,long k,int mid){
        
        for(int i=0;i<candies.length;i++){
            int temp= candies[i]/mid;
            k-=temp;

            if(k<=0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] candies={5,8,6};
        int k=3;
        int l=1;
        int r=(int)Math.pow(10, 7);
        while (l<=r) {
            int mid=l+(r-l)/2;       
            if(isPossible(candies, k, mid)){
                l=mid+1;
            }     
            else{
                r=mid-1;
            }
        }
        System.out.println(r);
    }
}
