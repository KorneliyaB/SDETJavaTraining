package Project2.Task9;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void Email() {
        if (this.email.endsWith("@yahoo.com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email. Only Yahoo emails are allowed");
        }
    }

    public void userName() {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username. It can`t be empty & must be longer than 6 characters");
        }
    }

    public void password() {
        if (this.password != null && this.password.length() > 6 && !this.password.contains(userName)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password. It can`t be empty, should be longer than 6 characters, and can`t contain the Username");
        }
    }

}
