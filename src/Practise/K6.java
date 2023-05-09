package Practise;

public class K6 {
        public static String alphabetical(String s)
        {
            s=s.toLowerCase();
            char max=s.charAt(0);
            String result=String.valueOf(s.charAt(0));
            for(int i=0;i<s.length();i++) {
                if(max<s.charAt(i)){
                    result+=String.valueOf(s.charAt(i));
                    max=s.charAt(i);
                }
            }
            return (String)result;
        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(K6.alphabetical("adatplqzh"));//"adtz"
            System.out.println(K6.alphabetical("abczef"));// "abcz"
            System.out.println(K6.alphabetical("dbeuptvwmy"));// "deuvwy"
        }
    }

