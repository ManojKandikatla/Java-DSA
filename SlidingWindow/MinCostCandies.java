import java.util.Arrays;
public class MinCostCandies {
    public static void main(String[]args){
        int[] cost ={6,57,9,2,2};
        Arrays.sort(cost);
        int took=0;
        int ans=0;
        for(int i=cost.length-1;i>=0;i--){
            if(took==2){
                took=0;
            }else{
                ans += cost[i];
                took++;
            }
        }
        System.out.println(ans);
    }
}
