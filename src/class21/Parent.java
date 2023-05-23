package class21;

public class Parent {
final void getMerry(){
    System.out.println("Shakira");
}
void study(){
    System.out.println("Study medicine");
}
}
class Axel extends Parent{
    @Override
    void study(){
        System.out.println("I want SDET");
    }
}
