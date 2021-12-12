import java.util.Scanner;

public class InvoiceBO {

	static void processPayment(Invoice invoice, CreditCard  creditcard, Double amount) throws CreditLimitException{
		Scanner sc = new Scanner(System.in);
		int noOfAttempts = 0;
		Double invoicePartsDebtPayement=0.0d;
		Double invoiceTotalDebtPayement = 0.0d;
			while(invoiceTotalDebtPayement<invoice.getTotalAmount()){
			System.out.println("Do you want to process invoice payment?(yes/no)");
			String result=sc.next();
			if(result.equalsIgnoreCase("yes")){
				noOfAttempts++;
				System.out.println("Enter the amount :");
				invoicePartsDebtPayement = sc.nextDouble();
				if (invoice.getTotalAmount()<=amount ){
					 invoiceTotalDebtPayement = invoicePartsDebtPayement+invoiceTotalDebtPayement;
				}
				else{
					throw new CreditLimitException("Credit Limit Exceeded");
				}
			}
		}
			System.out.println("payment successfully done in "+ noOfAttempts + "attempts");	
		
	}

	
}
