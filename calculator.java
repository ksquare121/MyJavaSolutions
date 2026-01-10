class calc{
    void add(int a, int b){
        System.out.println(a + b);
    }
}


public class calculator {
    public static void main(String args[]){
        calc c1 = new calc();
        c1.add(5, 10);
    }
}
