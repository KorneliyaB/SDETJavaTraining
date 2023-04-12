package class9.HomeWork;

public class Sentence {
    //Create an array of words: Java, Saturday, day, coding, is. Print the following
    // sentence using elements of array: “Saturday is Java coding day”.
    public static void main(String[] args) {
        String [] sentence={"Java","Saturday","day","coding","is"};
        System.out.println(sentence[1]+" "+sentence[4]+" "+sentence[0]+" "+sentence[3]+" "+sentence[2]);

        System.out.println();

        String [] word=new String[5];
        word[0]="Java";
        word[1]="Saturday";
        word[2]="day";
        word[3]="coding";
        word[4]="is";
        System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
    }
}
