public class FindlenAtmostK1s {
    public static void main(String[]args){
        int[] arr={9,1,3,1,1,6,7,1,0,1};
        int k=2;
        int temp=0;
        int ans=0;
        int l=0;
        int n= arr.length;
        for(int r=0;r<n;r++){
            if(arr[r]==1){
                temp++;
            }
            while(temp>k){
                if(arr[l]==1){
                    temp--;
                }
                l=l+1;
            }
            ans= Math.max(ans,r-l-1);
        }
        System.out.println(ans);
    }
}

 