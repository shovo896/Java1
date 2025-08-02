interface InterfaceName {
    int CONSTANT = 10;
    void methodName();
    default void defaultMethod(){
        System.out.println("Default method in interface");
    }
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
    private void privateMethod() {
        System.out.println("Private method in interface");
    }
}
