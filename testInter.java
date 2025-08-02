interface TestInter{
    final int  a= 20 ;
    default void display(){
        System.out.println("Hello");
    }

}
// A class that implements the TestInter interface 
class testInter implements TestInter{
    // Driver Code 
    public static void main(String[] args){
        testInter t = new testInter();
        t.display();




    }

}