package atm;
public class Card {
    
    String cardNumber;
    String cardCompany;

    public Card(String cardNumber, String cardCompany) {
        this.cardNumber = cardNumber;
        this.cardCompany = cardCompany;
    }

    
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCompany() {
        return cardCompany;
    }

    public void setCardCompany(String cardCompany) {
        this.cardCompany = cardCompany;
    }
    
    
    
}
