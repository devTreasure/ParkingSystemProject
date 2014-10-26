package ParkingSystem.UI;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ParkingSystem.Entities.Ticket;
import ParkingSystem.domain.TicketManagement;



public class TikctmanagementTest {
	
	@Test
	public void multiplytest()
	{
		
		
	  TicketManagement  tm=new TicketManagement();
       
	  Ticket newticket= tm.createTicket();
       
       
     	 
		
		assertEquals(new Ticket(),newticket);
		//assertEquals(1, y);
	}

}
