class Base {
    void print() {
        System.out.println("This is a base class");
    }
}

class Derived extends Base {
    void print() {
        System.out.println("This is a Derived class");
    }
}

public class MethodOR {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.print();
    }

}