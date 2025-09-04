public class CountNiceSubArr {
    public static int atMost(int []arr,int k){
        int n=arr.length;
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(arr[r]%2 ==1){
                temp++;
            }
            while(temp>k){
                if(l % 2==1){
                    temp--;
                }
                l++;
            }
            ans += r-l+1;
        }
        return ans;
    }
    public static void main(String[]args){
        int[] arr={1,2,1,1};
        int k=3;
       int finalans= atMost(arr,k)-atMost(arr,k-1);
       System.out.println(finalans);

    }
}
