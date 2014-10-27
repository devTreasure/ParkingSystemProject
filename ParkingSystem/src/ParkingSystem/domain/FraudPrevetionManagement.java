package ParkingSystem.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.Ticket;

public class FraudPrevetionManagement {
	
	private List<Ticket> ticketcollection  =   new ArrayList<Ticket>();
	
	private List<Gate> gatecollection  =   new ArrayList<Gate>();
	
	Map<String, Gate > multiMap =  new   HashMap<String, Gate >();
	
	public Map<Ticket, Gate > ticketgatecollection =  new   HashMap<Ticket, Gate >();


	public Map<String, Gate> getMultiMap() {
		
		return multiMap;
	}

	public void setMultiMap(Map<String, Gate> multiMap) {
		
		this.multiMap = multiMap;
		
	}

	public FraudPrevetionManagement() {

	}

	public void checkNovoidticketEnteredforPaymentAtexit() {

	}

	public void checkNoExitWithoutPay() {

	}

	public void checkNoEntryWithoutTicket() {

	}

	public void entryAndExitsgates() {
		// there must be one exit and one entry for each ticket
		// no two exits per one ticket
		// no two entry per one ticket
	}

	public Boolean isValidTicet(Ticket t) {

		return false;
	}

	public List<Ticket> getTicketcollection() {
		return ticketcollection;
	}

	public void setTicketcollection(List<Ticket> ticketcollection) {
		this.ticketcollection = ticketcollection;
	}
	
	public void checkentryExitOperation()
	{
		for (Map.Entry<Ticket, Gate> entry : ticketgatecollection.entrySet()) {
			Ticket key = entry.getKey();
			Gate value = entry.getValue();
			
			 
		    
		}
		
	}
	
}
