package assignment2;

public class Main {
    public static void main(String[] args) {
//        Account account1 = new Account("ReggieBelefonte", 123456789, -123.12);
//        Account account2 = new Account("ReggieBelefonte", 123456789, -123.12);
//        Account account3 = new Account("Greg Heffley", 123456789, 123.12);
//        System.out.println(account1);
//        System.out.println(account1.equals(account2));
//        System.out.println(account1.equals(account3));

        Bank bank1 = new Bank("CIBC1234", "gregory");
        System.out.println(bank1.getBankName());
        System.out.println(bank1.getBranchLocation());
    }
}