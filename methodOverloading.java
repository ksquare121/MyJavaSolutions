class overloading {
    int add (int a , int b){
        return a+b;
    }
    int add (int a , int b , int c)
    {
        return a+b+c;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        int s1 , s2 ;
        overloading obj = new overloading();
        s1 = obj.add(10,20);
        s2 = obj.add(10,20,30);
        System.out.println("Sum of two numbers: " + s1);
        System.out.println("Sum of three numbers: " + s2);        
    }
}
