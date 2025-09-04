public class StringBuilderr {
    //mutable changeable
    //strings change avvali ante O(n) loo avvthadhi but by using StringBuilder O(1)loo avvthadhi i.e striin ni change cheyali ante last dhaka travel chesi last loo add avvthadhi it takes more time to over come this we uses stringbuilder 
    public static void main(String[]args){

        /*string builder same string laage work avthadhi
         * String name="Manoj";
         * name+="kumar";
         * S.o.p(name);
         */

    StringBuilder nameb= new StringBuilder("Manoj");
    nameb.append("kumar");
    System.out.println(nameb);
    String s=nameb.toString();//converting stringbuilder to string
    System.out.println(s);
    }
}
