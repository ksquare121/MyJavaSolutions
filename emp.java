class Employee {
    int e_id;
    String e_name;
    void display(){
        System.out.println(e_id + "-" + e_name);
    }
}
public class emp {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.e_id = 201;
        e1.e_name = "Bob";
        e1.display();
    }
}

