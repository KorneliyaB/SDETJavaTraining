package class21;

public class Refresher {
    public static void main(String[] args) {
        //int number=10;
        //int []arr={number,20,30};
        int[] arr={10,20,30}; //creating an array
        for (int num:arr){
            System.out.println(num);
        }
        String [] names={"Vlad","Marina","Veronika"};
        for (String name:names){
            System.out.println(name.length());
        }
        Dog dog1=new Dog("Lal","black","persian") ;
        Dog[] dogs={dog1,new Dog("Papi","white","chinese")};
        for (Dog dog:dogs){
            dog.printInfo();
        }
    }

}
