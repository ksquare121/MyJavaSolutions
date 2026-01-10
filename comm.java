class communication {
    void show(String type){
        System.out.println("Message :" + type);   
    }
}


public class comm {
    public static void main(String args[]){
        communication com1 = new communication();
        com1.show("Hello World");
    }
    
}
