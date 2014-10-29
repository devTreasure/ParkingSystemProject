package ParkingSystem.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ParkingSystem.Entities.EntryGate;
import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.Ticket;
import ParkingSystem.controller.FraudPreventionManagement;
import ParkingSystem.controller.ParkingSystemManager;

public class FraudPreventionManagementTest {

	@Test
	public void checkEntryWithVaildTicket() {
		ParkingSystemManager pm = new ParkingSystemManager();
		Ticket t = pm.ticketmager.createTicket();
		t.activatetheTicektStatus();

		Gate g = new EntryGate(1);

		FraudPreventionManagement fm = new FraudPreventionManagement();

		Boolean isvalid = fm.checkNoEntryWithoutTicket(t, g);

		assertEquals(true, isvalid);
	}
	
	@Test
	public void checkEntryWithoutVaildTicket() {
		ParkingSystemManager pm = new ParkingSystemManager();
		Ticket t = pm.ticketmager.createTicket();
		

		Gate g = new EntryGate(1);

		FraudPreventionManagement fm = new FraudPreventionManagement();
        //Ticket is not activated
		Boolean isvalid = fm.checkNoEntryWithoutTicket(t, g);

		assertEquals(false, isvalid);
	}

	
	@Test
	public void isValidTicketReturnsFalseWhenTicketIsNotActive()
	{
		ParkingSystemManager pm = new ParkingSystemManager();
		Ticket t = pm.ticketmager.createTicket();
		
		//Ticket is created but not activated.

		FraudPreventionManagement fm = new FraudPreventionManagement();
     
        assertEquals(false,  fm.isValidTicket(t));
		
	}
	
	
	@Test
	public void isValidTicketReturnsTrueWhenTicketIsActive()
	{
		ParkingSystemManager pm = new ParkingSystemManager();
		Ticket t = pm.ticketmager.createTicket();
		
		t.activatetheTicektStatus();
		//Ticket is created but not activated.

		FraudPreventionManagement fm = new FraudPreventionManagement();
     
        assertEquals(true,  fm.isValidTicket(t));
		
	}
}
