package class20.HomeWork;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will
    // calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    protected double balance;
    protected double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    void calculateInterest(){
        System.out.println("Interest - "+(balance*interest));
    }
}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }
    void calculateInterest(){
        System.out.println("Interest is "+(balance*interest));
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard(2000,0.1);
        Visa v=new Visa(3500,0.1);
        AX ax=new AX(3000,0.2);
        cc.calculateInterest();
        v.calculateInterest();
        ax.calculateInterest();

    }
        }
