public class FindingMaxStringPairs{

    public static String reverse(String s){
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    public static void main (String[] args){
        String[] words ={"cd","ac","dc","ca","zz","bc","cb"};
        int n = words.length;
        int ans = 0;
        for(int i=0;i<n-1;i++){
            String a= words[i];
            if(a.equals("0")){
                continue;
            }
            for(int j=i+1;j<n;j++){
                String b= words[j];
                String revb =reverse(b);
                if(revb.equals(a)){
                    ans++;
                    words[j]="0";
                    break;
                }
            }
        }
        System.out.println(ans);
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         System.out.println(i+" "+j);
        //     }
        // }
    }
}