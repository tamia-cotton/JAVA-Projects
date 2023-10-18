class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    private String firstName;
    public static double total =0;
    public BankAccount(String nameParam) {
        firstName = nameParam;
        checkingBalance= 0;
        savingsBalance = 0;
        numberOfAccounts++;}
    public BankAccount(String nameParam, double checkingInitial, double savingsInitial) {
        firstName = nameParam;
        checkingBalance += checkingInitial;
        savingsBalance += savingsInitial;
        numberOfAccounts++;
        total+=checkingInitial;
        total+=savingsInitial;}
    public double getCheckingsBalance(){
        return checkingBalance;}
    public double getSavingsBalance(){
        return savingsBalance;}
    public double depositMoney(String accountType, double deposit){
        if(accountType == "Checking"){
            checkingBalance+= deposit;
            total+= deposit;
            return checkingBalance;
        }
        else if(accountType== "Savings"){
        savingsBalance+= deposit;
        total+= deposit;
        return savingsBalance;
        }
        return 1;
    }
    
    public double withdrawMoney(String accountType, double withdraw){
        if(accountType == "Checking"){
            if(checkingBalance>=withdraw){
                checkingBalance-=withdraw;
                total-=withdraw;
                return checkingBalance;
            }
            
        }
        else if(accountType== "Savings"){
        if(savingsBalance>=withdraw){
                savingsBalance-=withdraw;
                total-=withdraw;
                return savingsBalance;
        }
        
    }return 0;}
    public static double total(){
        return total; 
    }
}