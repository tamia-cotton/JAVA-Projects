public class TestBankAccount{
public static void main(String[] args) {
    BankAccount Tamia = new BankAccount("Tamia", 55, 100);
    System.out.println(BankAccount.numberOfAccounts);
    System.out.println(Tamia.getCheckingsBalance());
    System.out.println(Tamia.getSavingsBalance());
    System.out.println(Tamia.depositMoney("Checking",55));
    System.out.println(Tamia.withdrawMoney("Checking",55));
    System.out.println(BankAccount.total());

}}