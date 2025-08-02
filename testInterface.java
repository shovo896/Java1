interface testInterface{
    final int a = 10;
    void display();



}
class TestClass implements testInterface {
    public void display() {
        System.out.println("Value of a: " + a);
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.display();
    }
}