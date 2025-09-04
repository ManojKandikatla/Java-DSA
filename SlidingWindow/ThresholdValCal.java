public class ThresholdValCal {
    public static void main(String[]args){
        int[] arr={1,2,3,1,4};
        int t= arr.length;
        int ans=0;
        int threshold=7;
        int temp=0;
        int k=3;
        int l=0;
        for(int r=0;r<t;r++){
            temp+=arr[r];
            if(r-l==k){
                temp-=arr[l];
                l++;
            }
            if(r-l+1==k){
                if(temp/k >=threshold){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
