package class14.HomeWork;

public class task2 {
    //Create a method createEmail(). Based on values of users firstName, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String createEmail(String firstName, String lastName,String email ){
        StringBuilder builder=new StringBuilder();
        builder.append(firstName);
        builder.append(lastName.concat("@"));
        builder.append(email.concat(".com"));

        String sentence = builder.toString().toLowerCase();
        return sentence;
    }

    public static void main(String[] args) {

        task2 obj = new task2();

        String firstName = "John";
        String lastName = "Snow";
        String email = "gmail";

        String result = obj.createEmail(firstName, lastName, email);
        System.out.println(result);

    }


}
