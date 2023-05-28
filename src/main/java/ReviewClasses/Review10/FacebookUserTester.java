package ReviewClasses.Review10;

public class FacebookUserTester {
    public static void main(String[] args) {
        FacebookUser vlad=new FacebookUser("Vlad",
                "user1254","pass15987","1-1-1950");
        System.out.println(vlad.getDob());
        System.out.println(vlad.getUserName());
        vlad.setUserName("wow123");
        System.out.println(vlad.getUserName());


    }
}
