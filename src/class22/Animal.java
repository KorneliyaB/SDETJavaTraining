package class22;

public abstract class Animal {
    abstract void speak();
    abstract void eat();
    abstract void sleep();
}
class Dog extends Animal{
@Override
    void speak(){
    System.out.println("woof");}
@Override
void sleep(){
    System.out.println("sleep");}
@Override
    void eat(){
    System.out.println("eat a lot");}}
class Horse extends Animal{
    @Override
    void speak(){
        System.out.println("egogo");
    }
    @Override
    void sleep(){
        System.out.println("sleep sleep");}
    @Override
    void eat(){
        System.out.println("eat a lot");
}}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("meow");}
    @Override
    void sleep(){
        System.out.println("sleep sleep sleep");}
    @Override
    void eat(){
        System.out.println("eat a lot");
    }}

