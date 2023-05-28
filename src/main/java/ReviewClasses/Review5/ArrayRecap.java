package ReviewClasses.Review5;

public class ArrayRecap {
    public static void main(String[] args) {
        String [] languages={"English","Ukrainian","Hungaruian","Spanish"};
        // enhanced loop ==>  for(datatype veriable:array)
        for (String language:languages){
            System.out.print(language+" ");
        }
        System.out.println();
        //print elements in reverse order
        // for (int i= languages.length-1; i>=0; i--){
        for (int i= 4-1; i>=0; i--){
            System.out.print(languages[i]+ " ");
        }
    }
}
