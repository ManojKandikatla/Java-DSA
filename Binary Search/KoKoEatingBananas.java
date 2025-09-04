public class KoKoEatingBananas {
    public static boolean isPossible(int[] piles,int h,int k){
        for(int i=0;i<piles.length;i++){
            int temp=piles[i]/k;
            if(piles[i]%k!=0){
                temp++;
            }
            h-=temp;
            if(h<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[] piles ={3,6,7,11};
        int h =8;
        int l=1;
        int r=(int)Math.pow(10, 8); 
        while (l<r) {
            int mid=l+(r-l)/2;
            if(isPossible(piles,h,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
  