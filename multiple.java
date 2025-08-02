import java.io.*;
interface Add{
    int add(int a,int b);
}
// Sub interface 
interface Sub{
    int sub(int a,int b);
}
// Calculator class implementing both interfaces 
class Cal implements Add,Sub{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class multiple{
    // main method 
    public static void main(String[] args)
    {
        Cal x = new Cal();
        System.out.println("Addition: " + x.add(10, 5));
        System.out.println("Subtraction: " + x.sub(10, 5));
    }
}

