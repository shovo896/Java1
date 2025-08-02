interface static1 {
    final int a = 10;

    static void display() {
        System.out.println("Static method in static1 interface");
    }
}

// A class that implements the static interface
class static1 implements static1 {
    public static void main(String[] args) {
        static1.display(); 
    }
}
