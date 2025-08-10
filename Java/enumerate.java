import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class enumerate {
    public static void main(String[] args) {
        // create a vector and add elements
        Vector v = new Vector();
        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator lit = v.listIterator();
        // print class names of iterators 
        System.out.println("Class of Enumeration: " + e.getClass().getName());
        System.out.println("Class of Iterator: " + itr.getClass().getName());
        System.out.println("Class of ListIterator: " + lit.getClass().getName());
       
        }
    }
    

