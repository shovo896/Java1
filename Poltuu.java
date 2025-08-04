import java.util.*;
public class Poltuu {
    //Main method 
    public static void main(String args[]){
        Stack<String> stack=new Stack<String>();
        stack.push("Dutee");
        stack.push("For");
        stack.push("me");
        stack.push("Mine");
        // Iterator for the stack 
        Iterator<String>itr=stack.iterator();
        // printing the stack 
        while (itr.hasNext()) {
            System.out.print(itr.next()+"");
        }
        System.out.println();
        stack.pop();
        // Iterator for the stack 
        itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"");
        }


        







    }
    
}
