package ParkingSystem.Entities;

import java.util.*;
import java.util.Date;

public class CreditCard {

	private String CCNumner;
	private String expiryDate;
	private int cvvNumber;
	private String FirstName;
	private String LastName;
	private String Address1;
	private String Address2;
	private String StateCode;
	private String State;
	private String zip;
	private String CountryCode;
	private String Country;
	private UUID ticketID;

	public CreditCard() {

	}

	public String getCCNumner() {
		return CCNumner;
	}

	public void setCCNumner(String cCNumner) {
		CCNumner = cCNumner;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public UUID getTicketID() {
		return ticketID;
	}

	public void setTicketID(UUID ticketID) {
		this.ticketID = ticketID;
	}
}
