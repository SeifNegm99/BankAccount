package bankaccount;

public class BankAccount {
    int AccountNumber=0;
    int AccountBalance=0;
    public BankAccount (int AccountNumber, int AccountBalance){
        this.AccountBalance=AccountBalance;
        this.AccountNumber=AccountNumber;
    }
    public void setAccountNumber(int num){
        this.AccountNumber=num;
    }
    public void withdraw (int ammount){
        this.AccountBalance= this.AccountBalance - ammount;
    }
    public void deposit (int ammount){
        this.AccountBalance=this.AccountBalance + ammount;
    }
    public void printData(){
        System.out.println("Accout Number is  "+this.AccountNumber);
        System.out.println("Accout Balance is  "+this.AccountBalance);
        
    }
    public static void main(String[] args) {
        BankAccount account1= new BankAccount(1,100);
        account1.setAccountNumber(1);
        account1.deposit(10000);
        account1.printData();
    }
    
}
