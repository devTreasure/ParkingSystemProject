package ParkingSystem.domain;
import java.util.UUID;

import javax.swing.JOptionPane;

import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.Status;
import ParkingSystem.Entities.Ticket;
import ParkingSystem.Entities.TicketStatus;


public class TicketManager {
	
	
	public GateManagement    gatemanagement=new GateManagement();
	public TicketManagement   ticketmager=new TicketManagement();
	public PaymentManagement paymanager=new PaymentManagement();
	public OccupancyManagement occupancy=new OccupancyManagement();
    
    
    public Ticket ticket;
    public Gate gate =   new Gate(1);
    
    public Gate getGate() {
		return gate;
	}

	public void setGate(Gate gate) {
		this.gate = gate;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
    
    public Status processExitFor(UUID ticketID) {
		
    	Status status = null;
		Ticket ticket=null;
		for(Ticket t : ticketmager.getTicketcollection())
		   {
			   if(t.getTicektID()==ticketID)
		         {
				   ticket =t;
			    }
		    // TODO add your handling code here:
		    }
		   
		if (ticket != null && ticket.getTicektStatus() == TicketStatus.Active && ticket.getIsPaid() == true) {

			ticket.deactivatetheTicektStatus();
			occupancy.decrementOcccupancy();

			gatemanagement.closeGate();
			status = new Status(true, "Vehicle exited from gate.");
			
		} else {
			status = new Status(true, "Unknown vehicle. Inform security.");
		}
		return status;
	}

	public TicketManager()
    {
    	
    }

}
