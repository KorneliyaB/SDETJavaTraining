package ReviewClasses.Review10;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        String []names=new String[5];
        ArrayList<String> amazonList=new ArrayList<>(1000000); //optional you can specify size in () or not

        long start=System.currentTimeMillis();
        for (int i=0;i<10000000; i++){
            amazonList.add(String.valueOf(i));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
