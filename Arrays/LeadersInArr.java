import java.util.ArrayList;

public class LeadersInArr {
    public static void main(String[] args) {
        int[] a= {3,2,16,4,8,2,1};
        ArrayList <Integer> ans = new ArrayList<>();
        int n= a.length;
        int l= a[n-1];
        ans.add(l);
        for(int i=n-2;i>=0;i--){
            if(a[i]>l){
                l=a[i];
                ans.add(l);
            }
        }
        System.out.println(ans);

    }
}
