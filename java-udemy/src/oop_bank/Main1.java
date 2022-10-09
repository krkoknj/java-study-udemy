package oop_bank;

public class Main1 {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        // setter 대신 생성자
        /*bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhoneNumber("010-1234-5678");*/
        
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        System.out.println(bobsAccount.toString());
    }
}
