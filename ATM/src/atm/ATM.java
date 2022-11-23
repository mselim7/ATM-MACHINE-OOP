package atm;
public class ATM 
{
    public static void main(String[] args) 
    {
        Card cd = new Card("443488", "Master") ;
        Session s = new Session("2221", "8/5/2021" , cd) ;
        Transaction tr = new Transaction("999", "withdraw");
        s.addTransaction(tr);
        
        
        BankAccount bk = new BankAccount("888", "saving");
        Customer c = new  Customer("558", "ali");
        
        c.addAccountToCustomer(bk);
        bk.setC(c);
        
    }
}
