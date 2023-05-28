package Practise.Encapsulation;

public class Person{
    String firstname;
    String lastname;
    int birthmonth;
    int birthday;
    int birthyear;
    String ssn;

    Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;

        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthMonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthYear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }
    public String formatBirthday(int birthmonth, int birthday, int birthyear) {
        return birthmonth + "/" + birthday + "/" + birthyear;
    }
}
