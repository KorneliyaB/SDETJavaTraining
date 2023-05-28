package Practise.Encapsulation;

public class MAin1 {
    public static void main(String[] args) {
        Person person=new Person("John","Doe",10,25,1990,"123-45-6789");

        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println((person.getBirthMonth())+" "+(person.getBirthday())+" "+(person.getBirthYear()));

    }
}

