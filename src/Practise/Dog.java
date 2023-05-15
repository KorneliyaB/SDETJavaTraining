package Practise;

public class Dog {
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    void printInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}
