import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class disjoint {
    public static void main(String[]args){
        List<String> l1=new ArrayList<>();
        l1.add("Red");
        l1.add("Green");
        l1.add("Blue");
        l1.add("Black");
        List<String> l2=new ArrayList<>();
        // add elements 
        l2.add("White");
        l2.add("Yellow");
        l2.add("Pink");
        System.out.println(Collections.disjoint(l1, l2));







    }
    
}
