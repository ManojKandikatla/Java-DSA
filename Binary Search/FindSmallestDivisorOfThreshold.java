public class FindSmallestDivisorOfThreshold {

    public static boolean isPossible(int[] nums,int threshold,int k){
        for(int i=0;i<nums.length;i++){
            int upper =nums[i]/k;
            if(nums[i]%k!=0){
                upper++;
            }
            threshold-=upper;
            if(threshold<0){
                return false; 
            }
        }
        return true;
    }

    public static void main(String[]args){
        /*question enti ante num values ni k tho devide chesi vachina ansers ni add chesthe threshold kanna chinnadhi ravali attla vasthe true return chestham lekpothe false chestham k value increase aitha vunte probability of getting true will increase
         

        here final result l ki 5 vasthadhi because at number 5 value true aithadhi
         */
        
        int[] nums={1,2,5,9};
        int threshold = 6;
        int l=0;
        int r= 1000000;
        while(l<r){
            int mid =l+(r-l)/2;
            if(isPossible(nums,threshold,mid)){
                r= mid-1;
            }
            else{
                l=mid+1;
            }
        }
       System.out.println(l);
    } 
}
  