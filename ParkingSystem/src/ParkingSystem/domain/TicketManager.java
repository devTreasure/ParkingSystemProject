package ParkingSystem.domain;
import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.Ticket;


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
    
    
    public TicketManager()
    {
    	
    }

}
