package atm;
import java.util.ArrayList;
public class Session {
    
    String sessionID;
    String sessionDate;

    Card c ;
    ArrayList <Transaction> trans;
    
    public Session(String sessionID, String sessionDate , Card c) {
        this.sessionID = sessionID;
        this.sessionDate = sessionDate;
        this.c = c ;
        trans = new ArrayList<>();
    }

    
    public boolean addTransaction(Transaction t)
    {
        return this.trans.add(t);
    }
    
    
    
    
    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }
    
    
}
