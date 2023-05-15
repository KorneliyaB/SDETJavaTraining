package class21;

public class Refresher1 {
    public static void main(String[] args) {

    Dog[] dogs={new Dog("Lol","black","Persian"),new Dog("Papi","white","chinese")};
        //previous line => Creating obj of dog class,Creating an array
    //Dog d= dogs[0]; //getting the element from array Dog index 0.
    //d.printInfo();

      //  for (int i=0;i<dogs.length;i++){
           // dogs[i].printInfo();

            for(Dog d:dogs){
                d.printInfo();
            }
        }
}
