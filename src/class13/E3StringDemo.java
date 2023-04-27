package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="gjfsegjgsGFHG GC1235468@#$^&*(*";
        System.out.println(str.replaceAll("[a-z]",""));//if we do not provide any
        // replacement it will delete
        System.out.println(str.replaceAll("[^a-z]",""));// here '^' sign means 'not' operator
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Gn3]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));// with'$' sign we use '\\'
        System.out.println(str.replaceAll(" ","\\$"));

    }
}
