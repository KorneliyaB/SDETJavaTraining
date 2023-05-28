package class17;

public class Food {
    String name="Pasta";
    void printFood(){
        String name="Burgers";
        //always local variables are preferred by Java
        System.out.println(name);//output burgers
        System.out.println(this.name);//output pasta

    }

    public static void main(String[] args) {
        Food food=new Food();
        food.printFood();
    }
}

