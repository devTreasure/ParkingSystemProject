package ParkingSystem.controller;

import java.util.List;

import ParkingSystem.Entities.Ticket;
import ParkingSystem.Reports.ReportCreator;

public class ReportManagement {

	private TicketManagement ticketManagement;

	public ReportManagement(TicketManagement ticketManagement) {
		super();
		this.ticketManagement = ticketManagement;
	}

	public List<Ticket> generateReport(int reportType)
	{
		List<Ticket> allTickets = ticketManagement.getTicketcollection();
		
		List<Ticket> data = ReportCreator.getReport(reportType).getReport(allTickets);
		return data;
	}
	
	
	
}
