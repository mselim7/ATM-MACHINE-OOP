package atm;
public class Transaction {
    
    String transID ;
    String transType;

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public Transaction(String transID, String transType) {
        this.transID = transID;
        this.transType = transType;
    }
    
    
}
