import java.util.*;

public class pverIterate {
    public static void main(String[]args){
        // create and populate the list 
        Collection<String> l=new LinkedList<>();
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Black");
        System.out.println("List: " + l);
        // create an iterator 
        Iterator<String> it=l.iterator();
        // iterate through the list 
        // at first make it display 
        System.out.println("Iterating through the list:");
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }









    }
    
}
