package Project2.Task9;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration registration = new Registration();
        registration.setEmail("Korneliya.Sh@yahoo.com");
        registration.setUserName("KorneliyaSh");
        registration.setPassword("pass123456$");

        registration.Email();
        registration.userName();
        registration.password();


    }

}
