package atm;
import java.util.ArrayList;
public class Customer {
    
    String cuID; 
    String cuName;

    ArrayList<BankAccount> bks ;
    
    public Customer(String cuID, String cuName) {
        this.cuID = cuID;
        this.cuName = cuName;
        bks = new ArrayList<>();
    }

    public boolean addAccountToCustomer(BankAccount acc)
    {
        acc.setC(this);
        return this.bks.add(acc);
    }
    
    
    public String getCuID() {
        return cuID;
    }

    public void setCuID(String cuID) {
        this.cuID = cuID;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }
    
    
}
