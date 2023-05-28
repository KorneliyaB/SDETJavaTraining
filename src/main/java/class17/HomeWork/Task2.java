package class17.HomeWork;

public class Task2 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors
    // (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    // 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.
    String name;
    int age;

    private Task2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: "+name +" age: "+ age);
    }
    public Task2(String name){
        this.name=name;
        System.out.println("Name "+name);
    }
    Task2(){
    }
    protected Task2(int age){
        this.age=age;
        System.out.println("Age "+age);
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        System.out.println(obj.name="Korneliya");
        Task2 obj2=new Task2("Korneliya",29);
        Task2 obj3=new Task2("Korneliya");
        Task2 obj4=new Task2(29);




    }
}
