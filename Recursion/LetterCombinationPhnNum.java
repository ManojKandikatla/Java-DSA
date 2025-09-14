import java.util.ArrayList;

public class LetterCombinationPhnNum {
    public static void main(String[] args) {
        pad("", "12");//for example 1-phnpad loo abc vunntadhi 2 num pad loo def vunte each char with other char are gona print
        System.out.println(padArraylist("", "12"));
    }

    
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

       int digit = up.charAt(0)-'0';//thi will convert from '2' to 2


       for(int i = (digit-1)*3; i<digit*3;i++){
        //super logic idhi example thoo chptha
        //digit 2 anukoo i=(2-1)*3;i=2*3 ante 1 dharaga start ayi lessthen 6 varaku print chesthadhi

        char ch = (char)('a'+i);//a+2 =c stores in ch

        pad(p+ch, up.substring(1));//up loo vunna 1st element ni p loo add chesthunam or every itteration
       }
    }
    //storeing it in arraylist and returning
    static ArrayList<String> padArraylist(String p,String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);

            
            return list;
        }

       int digit = up.charAt(0)-'0';

       ArrayList<String> total = new ArrayList<>();

       for(int i = (digit-1)*3; i<digit*3;i++){
        char ch = (char)('a'+i);
       total.addAll(padArraylist(p+ch, up.substring(1)));
    }
    return total;
    }
}
