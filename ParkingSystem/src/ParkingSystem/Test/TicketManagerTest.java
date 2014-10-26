package ParkingSystem.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ParkingSystem.Entities.Ticket;
import ParkingSystem.Entities.TicketStatus;
import ParkingSystem.domain.TicketManagement;

public class TicketManagerTest {

	@Test
	
	public void creteTicketMethodcreatesNewTicketObject(){
		
		TicketManagement  t=new TicketManagement();
	    Ticket newticket=t.createTicket();
		Ticket ts=new Ticket();
		
		
		assertEquals(newticket, ts);
	
	}
	
	@Test
	public void newlycreatedticketMustHavesuniqueParkingID()
	{
		TicketManagement  t=new TicketManagement();
	    Ticket newticket=t.createTicket();
		Ticket ts=new Ticket();
		
		
		assertNotEquals(newticket.generateTicketID(), ts.generateTicketID());
	}
	
	@Test
	public void  newlyCreatedTicketMustbeAddedInTicketCollectionSystem()
	{
		
		TicketManagement  t=new TicketManagement();
	    Ticket newticket=t.createTicket();
		Ticket ts=new Ticket();
		
	     Boolean isTicektinCollection=	t.getTicketcollection().contains(newticket);
	     assertEquals(true, isTicektinCollection);
	  
	}
	
	@Test
	public void newlycreatedticketMustbeInActiveStatus()
	{
		TicketManagement  t=new TicketManagement();
	    Ticket newticket=t.createTicket();
		Ticket ts=new Ticket();
		
		newticket.activatetheTicektStatus();
		
		assertEquals(newticket.getTicektStatus(), TicketStatus.Active);
	}

}
