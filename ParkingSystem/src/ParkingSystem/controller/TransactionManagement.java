package ParkingSystem.controller;

import java.util.Calendar;

import javax.swing.JOptionPane;

import ParkingSystem.Entities.CreditCard;

public class TransactionManagement {

	// TODO: add all ticket transaction in collection for report ,yearly,monthly
	// weekly calculation
    
	CreditPaymentGateWay paymentgateway=new CreditPaymentGateWay();
	
	public Boolean ProcessTheTransaction(CreditCard card)
	{
	
		Boolean  transactionProcessed=false;
		
		if(isvalidCreditCard(card) &&  card.getAmount()>0)
		{
	        //processing amount
			if( paymentgateway.makePayment(card.getAmount()))
			   card.setAmount(0);
		}
		    
		return transactionProcessed;
	}

	public TransactionManagement() {

	}

	public Boolean validateTheYear(CreditCard card) {
		Calendar cal = Calendar.getInstance();
		Boolean validentry = false;

		int currentYear = cal.get(Calendar.YEAR);

		String entermonth[] = new String[2];

		try {
			String string = card.getExpiryDate();
			String[] parts = string.split("/");

			if (parts.length > 0) {

				int year = Integer.parseInt(parts[1]);

				if (year < currentYear) {
					JOptionPane.showMessageDialog(null,
							"Please enter valid month/year.");
				} else {
					validentry = true;
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"Please enter the date  in mm/YYYY format.");
			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null,
					"Please enter valid month/year.");
		}

		return validentry;
	}

	private Boolean isvalidCreditCard(CreditCard card) {

		Boolean isverified = false;

		if (card.getCCNumner().length() > 16
				|| card.getCCNumner().length() < 16) {
			isverified = true;
		} else

		{
			ParkingSystemManager.errorManager
					.setErrorMessage("Please Enter Valid Credit Card number");
		}

		if (this.validateTheYear(card)) {
			isverified = true;
		}

		return isverified;
	}
}
