import java.util.Arrays;
public class DiffbwScore {
    public static void main(String[]args){
        int[] nums={9,4,1,7};
        int k =2;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-k+1;i++){
            //System.out.println(i);
            int j=i+k-1;
            int temp=nums[j]-nums[i];
            min= Math.min(min,temp);
        }
        System.out.println(min);
    }
}
