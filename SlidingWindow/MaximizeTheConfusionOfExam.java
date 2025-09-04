public class MaximizeTheConfusionOfExam {
    public static void main(String[]args){
        String answerKey ="TTTF";
        int k=2;
        int n=answerKey.length();
        int ans=0;
        int cntt=0;
        int cntf=0;
        int l=0;
        for(int r=0;r<n;r++){
            char ch=answerKey.charAt(r);
            if(ch=='T'){
                cntt++;
            }else{
                cntf++;
            }
            while(Math.min(cntt,cntf)>k){
                if(answerKey.charAt(l)=='T'){
                    cntt--;
                }
                else{
                    cntf--;
                }
                l++;
            }
            ans= Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
