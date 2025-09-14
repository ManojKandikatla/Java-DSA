import java.util.ArrayList;

public class DicRollWithTargetSum {
     public static void main(String[] args) {
        
        dics("", 4); //ways to form 4
        System.out.println(dicsArraylist("",4));
    }

    static void dics(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
         for(int i = 1; i<=6 && i<= target;i++){
        dics(p+i, target -i);
    }
    }
    static ArrayList<String> dicsArraylist(String p, int target){
        if(target == 0){
           ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         ArrayList <String> sm = new ArrayList<>();
        for(int i = 1; i<=6 && i<= target;i++){
        sm.addAll(dicsArraylist(p+i, target -i));
        }
        return sm;
    }
}


