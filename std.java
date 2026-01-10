class Student {
    int roll;
    String name;
    void display(){
        System.out.println(roll + "-" + name);
    }
}
public class std{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Alice";
        s1.display();
    }
}