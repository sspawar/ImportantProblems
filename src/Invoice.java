
public class Invoice {
	private String invoiceNumber;
	private Double TotalAmount;
	private Integer attempt;
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	public Integer getAttempt() {
		return attempt;
	}
	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}
	public Invoice(String invoiceNumber, Double totalAmount, Integer attempt) {
		super();
		this.invoiceNumber = invoiceNumber;
		TotalAmount = totalAmount;
		this.attempt = attempt;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", TotalAmount=" + TotalAmount + ", attempt=" + attempt
				+ "]";
	} 
	
	

}
