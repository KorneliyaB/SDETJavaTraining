package class13.HomeWork;


public class task1 {
    // How would you reverse a String word by word? for example
    //        // input=>This is sentence i want to reverse
    //        // output=>sihT si ecnetnes i tnaw ot esrever
    public static void main(String[] args) {
        String convert = "This is sentence i want to reverse";
        StringBuilder str = new StringBuilder(convert);
        str.reverse();
        convert = str.toString();
        String[] newConvert = convert.split(" ");

        for (int i = newConvert.length-1; i >=0; i--) {
            System.out.print(newConvert[i] + " ");
        }

        System.out.println();

    }
}


