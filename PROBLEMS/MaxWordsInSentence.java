public class MaxWordsInSentence{
    public static void main(String[] args){
      String[] sentences ={ "please wait","continue to fight","continue to win fighter club"};
      int ans =1;
      for(int i=0;i<sentences.length;i++){
        String s=sentences[i];
          int temp =1;
          for(int j=0;j<s.length();j++){
            if(s.charAt(j)==' '){
                temp++;
            }
          } 
          ans = Math.max(temp,ans);
      }  
        System.out.println(ans);
    }
}