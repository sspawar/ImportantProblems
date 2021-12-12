import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws CreditLimitException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Invoince Number");
		String invoiceNumber=sc.next();
		System.out.println("Enter the total invoice amount");
		Double invoiceAmount = sc.nextDouble();
		System.out.println("Enter the credit card number");
		String cardNumber=sc.next();
		System.out.println("Enter the credit limit");
		Double cardLimit=sc.nextDouble();
		Invoice invoice =new Invoice(invoiceNumber,invoiceAmount,1);
		CreditCard creditCard=new CreditCard(cardNumber,cardLimit);
		InvoiceBO invoiceBO=new InvoiceBO();
		invoiceBO.processPayment(invoice, creditCard, cardLimit);
	}
}
