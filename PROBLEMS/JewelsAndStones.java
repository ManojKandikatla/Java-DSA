public class JewelsAndStones{
    public static void main(String[]args){
        String jewels="aA";
        String stones ="aAAbbbbb";
        int ans =0;
        for(int i=0;i<stones.length();i++){
            char st=stones.charAt(i);
            boolean itemFound = false;
            for(int j=0;j<jewels.length();j++){
                char je=jewels.charAt(j);
                if(st == je){
                    itemFound = true;
                    break;
                }
            }
        if(itemFound){
            ans +=1;
        }
        }
        System.out.println(ans);
    }
}