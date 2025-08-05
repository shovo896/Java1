import java.util.*;
public class LinkedHashset {
    public static void main(String args []){
        LinkedHashSet<String> lhs =new LinkedHashSet<String>();
        lhs.add("Red");
        lhs.add("Green");
        lhs.add("Blue");
        lhs.add("Black");
        lhs.add("White");
        Iterator<String> itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }







    }
    
}
