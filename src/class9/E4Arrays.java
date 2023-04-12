package class9;

public class E4Arrays {
    // create an array of String store 5 names
    // print all with help og for loop and while loop
    public static void main(String[] args) {
        String [] names={"Val","Kate","Tom","Mickey","Vicky"};
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] +" ");
        }
        System.out.println();
        int count=0;
        while (count<names.length){
            System.out.print(names[count++]+" ");
        }

    }
}
