package ParkingSystem.controller;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import ParkingSystem.Entities.CreditCard;
import ParkingSystem.Entities.Ticket;


public class PaymentManagement {
	
	private  CreditCard  creditCard;
	private int  parkingRate;
	
	
	private int hourlyRate=0;
	private List<CreditCard> creditcollection  =   new ArrayList<CreditCard>();
	
	
	
	public int getParkingRate() {
		return parkingRate;
	}


	public void setParkingRate(int parkingRate) {
		this.parkingRate = parkingRate;
	}



	public CreditCard getCreditCard() {
		return creditCard;
	}



	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}



	public int getHourlyRate() {
		return hourlyRate;
	}



	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}



	public void Pay(Ticket ticket)
	
	{
		creditcollection.add(this.creditCard);
		
	   if(ticket.getTicketAmount()>0)
		   
		   
		   ticket.setTicketAmount(0);// amount paid  and due is set 0
	       ticket.setIsPaid(true);
		
		//this.creditCard=objcreditCard;
	}

	 
	/*
	public long calculateParkingDuration(Date datein,Date dateOut)
	{
		long parkingDuration=(dateOut.getTime()  -  datein.getTime());
		long  finaltime = 0;
		
		if(parkingDuration>60000)
			finaltime = (parkingDuration/60000);
		
		
		return finaltime;
		
	}
*/


	public long calculateParkingDuration(Ticket ticket) {
		// TODO Auto-generated method stub
		
		long parkingDuration=(ticket.getExitTime().getTime()  -  ticket.getEntryTime().getTime());
		
		
		
		//long  finaltime = 0;
		//if(parkingDuration>60000)
		//finaltime = (parkingDuration/60000);
		
		long diffSeconds = parkingDuration / 1000 % 60;
		long diiference;
		
		if(parkingDuration< 60000)
			diiference = parkingDuration / (60 * 1000) % 60;
		else
		
			diiference =   ((parkingDuration / (1000*60*60)) % 24);
		
	    	//return random number here
					
		  return (long) ((2.5)  * this.hourlyRate);
		
	}
	
	
	
	
	
	
}
