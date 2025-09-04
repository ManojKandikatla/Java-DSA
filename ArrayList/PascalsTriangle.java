import java.util.*;
public class PascalsTriangle{
    public static void main(String[]args){
        int numRows=4;
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        ArrayList<Integer> firstRow =new ArrayList<>();

        firstRow.add(1);
        ans.add(firstRow);
        
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> tempRow=new ArrayList<>();
            tempRow.add(1);

            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                tempRow.add(val);
            }
            tempRow.add(1);
            ans.add(tempRow);
        }
        System.out.println(ans);
    }
} 