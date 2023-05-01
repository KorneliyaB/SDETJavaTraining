package class14.HomeWork;

public class task1 {
    //Create a method that will say Hello in different language
    // based on the country that will passed when method is executed.
    String language(String country){
        if (country.equalsIgnoreCase("USA")){
            country="Hello";
        }else if (country.equalsIgnoreCase("Ukraine")){
            country="Привіт";
        }else {
            country="Error";
        }
        return country;
    }

    public static void main(String[] args) {
        task1 obj=new task1();
        String country="Ukraine";
        String result=obj.language(country);
        System.out.println(result);
    }
}
