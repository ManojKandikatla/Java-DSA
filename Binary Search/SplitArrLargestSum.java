public class SplitArrLargestSum {
    public static boolean isPossible(int[] nums,int k,int mid){
        int temp=0;
        k-=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>mid){
                return false;
            }
            if(temp+val>mid){
                k--;
                temp=0;
            }
            temp+=val;
            if(k<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
    int[] nums={7,2,5,10,8};
    int k= 2;
    int l=0;
    int r=(int)Math.pow(10, 9);

    while(l<=r) {
        int mid= l+(r-l)/2;
        if(isPossible(nums, k, mid)) {
            r=mid-1;
        } 
        l=mid+1;
    }
    System.out.println(l);
    }
}