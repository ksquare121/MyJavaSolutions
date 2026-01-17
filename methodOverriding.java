class overriding {
    int add (int a , int b){
        return a+b;
    }
}
class Md extends overriding{
    int add (int a , int b){
        System.out.println("Overriding method called");
        return a*b;
    }
}
public class methodOverriding {
    public static void main (String args[]){
        int x;
        Md obj = new Md();
        x=obj.add(10,20);
        System.out.println("Result: " + x);
    }
}
