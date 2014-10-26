package ParkingSystem.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ParkingSystem.Entities.Ticket;
import ParkingSystem.domain.TicketManagement;

public class TicketManagerTest {

	@Test
	
	public void creteTicketMethodcreatesNewTicketObject(){
		
		TicketManagement  t=new TicketManagement();
	    Ticket newticket=t.createTicket();
		Ticket ts=new Ticket();
		
		
		assertEquals(newticket, ts);
	
	}

}
