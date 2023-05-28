package class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {
        //List=> interface
        Headset headset1=new Headset("Raze nari Ultimate",79.99,4620);
        Headset headset2=new Headset("New SteelSeries",52.64,4868);
        Headset headset3=new Headset("HyperX Cloud ||",0,32116);
        System.out.println(headset1.toString());
        List<Headset> headsets = new ArrayList<>();// Class arraylist implement List interface

        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);
        //for (Headset hs:headsets){
          //  hs.printInfo();}
        //printList(headsets);
       System.out.println(headsets);

    }
    //excess modifier=>...=>writen tipe=>
    public static void printList(List<Headset> headsets){// List can be past as a perimeter
        for (Headset hs:headsets){
            hs.printInfo();
        }
    }
}
class Headset{
    private String title;
    private double price;
    private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }
    void printInfo(){

    }
    @Override
    public String toString() {
    return title+" "+price+" "+noOfReviews;// whatever we put in return mwthod the Java will print t
    }
}
