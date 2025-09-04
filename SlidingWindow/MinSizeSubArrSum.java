public class MinSizeSubArrSum {
    public static void main (String[]args){

    int target=7;
    int[] nums={2,3,1,2,4,3};
    int l=0;
    int temp=0;
    int n=nums.length;
    int ans = Integer.MAX_VALUE;

    for(int r=0;r<n;r++){
        temp+=nums[r];

        while(temp>=target){
        ans=Math.min(ans, r-l+1);
        temp-=nums[l];
        l++;
    }
    }

    if(ans == Integer.MAX_VALUE){
        System.out.println("0");
    }
    System.out.println(ans);
    }
}