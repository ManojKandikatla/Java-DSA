public class IncrementProblem{
    public static void main(String[] args){
        String[] operations = { "--X","++X","X++","--X","++X","X--"};
        int ans = 0;
        for(int i=0;i<operations.length;i++){
            String temp = operations[i];
            if(temp.equals("++X")||temp.equals("X++")){
                ans = ans+1;
            }
            else{
                ans=ans-1;
            }
        }
            System.out.println(ans);
    }
} 