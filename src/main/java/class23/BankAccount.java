package class23;

public class BankAccount {
    String firstName;
   private String userName;
    private String password;
    private double accountBalance=120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    String getFirstName(){
        return firstName;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    //public double getAccountBalance(){
    //if (password.equals(this.password)){
    //        return accountBalance;
    // }else {
    //return 0;  }
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }
    void setPassword(String password){
        this.password=password;
    }
}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("ftghf","1235");
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.setAccountBalance(1000000);
        System.out.println(bankAccount.getAccountBalance());
    }
}
