class A {
    int a;
    void display() {
        System.out.println("Value of a: " + a);
    }
}
class B extends A {
    int b;
    void show() {
        System.out.println("Value of b: " + b);
    }
}
public class Inherit {
    public static void main(String[] args) {
        B obj = new B();
        obj.a = 10;
        obj.b = 20;
        obj.display();
        obj.show();
    }    
}
