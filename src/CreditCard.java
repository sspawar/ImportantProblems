
public class CreditCard {
	
	private String cardNumber; 
	private Double cardLimit;
	
	
	public CreditCard(String cardNumber, Double cardLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardLimit=" + cardLimit + "]";
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}
	
	


}
