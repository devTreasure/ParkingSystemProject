package ParkingSystem.Entities;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class Ticket {
	
	
	private Gate gate;
	private  Date   entryTime;
	private  Date   exitTime;
	private TicketStatus   ticektStatus;
	private UUID   ticketID;
	private float ticketAmount;
	private  Boolean isPaid;
	
	
	public Boolean getIsPaid() {
		return isPaid;
	}


	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}


	public  UUID generateTicketID()
	{
		 UUID id = UUID.randomUUID();
		 this.ticketID=id;
		 return  id;
	}


	public UUID getTicektID() {
		return ticketID;
	}


	


	public UUID getTicketID() {
		return ticketID;
	}


	public void setTicketID(UUID ticketID) {
		this.ticketID = ticketID;
	}


	public Gate getGate() {
		return gate;
	}


	public void setGate(Gate gate) {
		this.gate = gate;
	}


	public Date getEntryTime() {
		return entryTime;
	}


	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}


	public Date getExitTime() {
		return exitTime;
	}


	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}


	public TicketStatus getTicektStatus() {
		return ticektStatus;
	}


	public void setTicektStatus(TicketStatus ticektStatus) {
		this.ticektStatus = ticektStatus;
	}


	public Ticket()
	{
		  Calendar   c=Calendar.getInstance();
			
	      java.util.Date currenttime=c.getTime();
		
		  this.entryTime=currenttime;
		  this.ticketID=  this.generateTicketID();;
	}

	
	public void   activatetheTicektStatus()
	{
	     this.ticektStatus=TicketStatus.Active;
	}
	
	
	public void   deactivatetheTicektStatus()
	{
	     this.ticektStatus=TicketStatus.Void;
	}


	public float getTicketAmount() {
		return ticketAmount;
	}


	public void setTicketAmount(float ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
	
	
}
