package class23;

public interface MoveAble {
    void move();
}
interface WashAble{
    void wash(); //abstract by default
}

class Dog implements MoveAble,WashAble{
    @Override
    public void move() {
        System.out.println("Dogs can....");
    }
        @Override
        public void wash() {
            System.out.println("Can you wash me");
        }
}
class Cat implements MoveAble{
    @Override
    public void move(){
        System.out.println("Cats can also move");
    }
}
class Horse implements MoveAble{
    public void move(){
        System.out.println("Cats can also move");
    }
}
