import java.util.Arrays;
public class ArrayPartition {
    public static void main(String[]args){
        int[] nums={6,2,6,5,1,2};
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i=i+2){
            ans+=nums[i];
        }
        System.out.println(ans);

    }
}
