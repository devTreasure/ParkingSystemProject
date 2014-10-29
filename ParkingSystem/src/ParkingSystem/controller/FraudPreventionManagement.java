package ParkingSystem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.GateStatus;
import ParkingSystem.Entities.Ticket;
import ParkingSystem.Entities.TicketStatus;

public class FraudPreventionManagement {

	private List<Ticket> ticketcollection = new ArrayList<Ticket>();

	private List<Gate> gatecollection = new ArrayList<Gate>();

	Map<String, Gate> multiMap = new HashMap<String, Gate>();

	public Map<Ticket, Gate> ticketgatecollection = new HashMap<Ticket, Gate>();

	public Map<String, Gate> getMultiMap() {

		return multiMap;
	}

	public void setMultiMap(Map<String, Gate> multiMap) {

		this.multiMap = multiMap;

	}

	public FraudPreventionManagement() {

	}



	public Boolean checkNoExitWithoutPay(Ticket ticket) {
				
		if(isValidTicket(ticket)  &&  ticket.getIsPaid())
			return true;
		else
			return true;
	}

	public Boolean checkNoEntryWithoutTicket(Ticket ticket,Gate g) {
		
		Boolean isvalidEntry;
		
		if(isValidTicket(ticket))
		{
		  g.gateStatus=GateStatus.Open;
		  isvalidEntry=true;
		}
		else
		{
			  g.gateStatus=GateStatus.Close;
			  isvalidEntry=false;
		}
		
			
		return isvalidEntry;
	}

	public void entryAndExitsgates() {
		// there must be one exit and one entry for each ticket so in total to gate movements reported for each ticket.
		// no two exits per one ticket
		// no two entry per one ticket
	}

	public Boolean isValidTicket(Ticket ticket) {
		
		if((ticket != null && ticket.getTicektStatus() == TicketStatus.Active))
			return true;
		else
		   return false;
	}

	public List<Ticket> getTicketcollection() {
		return ticketcollection;
	}

	public void setTicketcollection(List<Ticket> ticketcollection) {
		this.ticketcollection = ticketcollection;
	}

	public void checkentryExitOperation() {
		for (Map.Entry<Ticket, Gate> entry : ticketgatecollection.entrySet()) {
			Ticket key = entry.getKey();
			Gate value = entry.getValue();

		}

	}

}
