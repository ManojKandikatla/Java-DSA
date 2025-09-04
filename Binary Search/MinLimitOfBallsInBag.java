public class MinLimitOfBallsInBag {
    public static boolean isPossible(int[] nums,int maxOperations,int k){
        for(int i=0;i<nums.length;i++){
            int val=nums[i];

            int temp=val/k;
            if(val%k!=0){
                temp++;
            }
            temp--;
            maxOperations-=temp;
            if(maxOperations<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[] nums={2,4,8,2};
        int maxOperations=4;
        int l=1;
        int r=(int)Math.pow(10, 9);
        while (l<=r) {
            int mid= l+(r-l)/2;
            if(isPossible(nums, maxOperations, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
