//O(n)
public class PrefixSum {
    public static void main(String[] args) {
        int[] a = {3,1,2,4,5};
        int[] PF = new int[a.length];
        PF[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i]=a[i-1]+a[i];
        }

        int[][] b = {{2,3},{1,4},{0,3}};

        int[] ans = Rangesum(a,b);
        for(int val:ans){
            System.out.print(val+ " ");
        }
        
    }
    public static int[] Rangesum(int[] PF, int[][] b){
        int ans[] = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            int s =b[i][0];
            int e =b[i][1];
            if(s==0){
                ans[i] = PF[e];

            }else{
                ans[i] = PF[e]-PF[s-1];
            }

        }
        return ans;
        
    }
}