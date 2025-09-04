public class BinarySubarrWithSum {
    public static int atMost(int[]nums,int k){
        if(k<0){
            return 0;
        }
        int n=nums.length;
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if((nums[r]==1)){
                temp++;
            }
            while(temp>k){
                if(nums[r]==1){
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public static void main(String[]args){
        int[] nums={1,0,1,0,1};
        int goal= 2;
        int finalAns =atMost(nums, goal)-atMost( nums,(goal)-1);
        System.out.println(finalAns);

    }
}
