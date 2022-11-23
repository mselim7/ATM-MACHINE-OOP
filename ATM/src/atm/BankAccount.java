package atm;
public class BankAccount {
 
    String accNumber;
    String accType;
    Customer c ;
    public String getAccNumber() {
        return accNumber;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public Customer getC() {
        return c;
    }

    
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public BankAccount(String accNumber, String accType) {
        this.accNumber = accNumber;
        this.accType = accType;
    }
    
    
}
