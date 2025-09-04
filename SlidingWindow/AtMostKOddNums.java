public class AtMostKOddNums {
    public static void main(String[]args){
        int[] arr={2,1,3};
        int k=1;
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
        System.out.println(ans);
    }
}