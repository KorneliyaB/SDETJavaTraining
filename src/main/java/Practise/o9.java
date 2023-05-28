package Practise;

public class o9 {
    public static String alphabetical(String str)
    {
        str=str.toLowerCase();
        char max=str.charAt(0);
        String result=String.valueOf(str.charAt(0));
        for(int i=0;i<str.length();i++) {
            if(max<str.charAt(i)){
                result+=String.valueOf(str.charAt(i));
                max=str.charAt(i);
            }
        }
        return (String)result;
    }

    //test case below (dont change):
    public static void main(String[]args){
        System.out.println(o9.alphabetical("hello"));
        System.out.println(o9.alphabetical("software"));
        System.out.println(o9.alphabetical("language"));
}

}
