import java.util.ArrayList;
import java.util.Iterator;

public class iterato {
    public static void main(String[]args){
        // create and populate the list 
        ArrayList<String> al = new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        // obtain an iterator for the list
        Iterator<String> it= al.iterator();
        // iterate through the list
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }












    }
    
}
