package Practise.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Account obj=new Account();
        obj.setAcc_no(7560504000L);
        obj.setName("Sumair");
        obj.setEmail("sumair@syntax.com");
        obj.setAmount(50000.0);

        System.out.println((obj.getAcc_no())+" "+(obj.getName())+" "+(obj.getEmail())+" "+(obj.getAmount()));
    }
}
