package ParkingSystem.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ParkingSystem.Entities.ReportType;
import ParkingSystem.Entities.Ticket;
import ParkingSystem.Reports.DailyReport;
import ParkingSystem.Reports.HourlyReport;
import ParkingSystem.Reports.MonthlyReport;
import ParkingSystem.Reports.Report;
import ParkingSystem.Reports.ReportCreator;
import ParkingSystem.Reports.WeeklyReport;
import ParkingSystem.controller.ParkingSystemManager;
import ParkingSystem.controller.ReportManagement;
import ParkingSystem.controller.TicketManagement;

public class ReportManagementTest {

	
	
	@Test
	public void reportShouldreturnHourlyReportbasedOnHourlyChoiseSelection()
	
	{
		
		TicketManagement  ticketmanagement=new TicketManagement();
		
		ReportManagement  reportmanagement=new  ReportManagement(ticketmanagement);
		
		Report  report=ReportCreator.getReport(ReportType.Hourly);
	
		HourlyReport objhourly=new HourlyReport();
		
		objhourly.setReportType(ReportType.Hourly);
		
        assertEquals(ReportType.Hourly, objhourly.getReportType());
	}
	
	
	
	@Test
	public void reportShouldreturnWeeklyReportbasedOnWeeklyChoiseSelection()
	
	{
		
		TicketManagement  ticketmanagement=new TicketManagement();
		
		ReportManagement  reportmanagement=new  ReportManagement(ticketmanagement);
		
		Report  report=ReportCreator.getReport(ReportType.Weekly);
	
		WeeklyReport objweekly=new WeeklyReport();
		
		objweekly.setReportType(ReportType.Weekly);
		
		assertEquals(ReportType.Weekly, objweekly.getReportType());
	}
	
	
	@Test
	public void reportShouldreturnDailyReportbasedOnDailyChoiseSelection()
	
	{
		
		TicketManagement  ticketmanagement=new TicketManagement();
		
		ReportManagement  reportmanagement=new  ReportManagement(ticketmanagement);
		
		Report  report=ReportCreator.getReport(ReportType.Weekly);
	
		DailyReport objdaily=new DailyReport();
		
		objdaily.setReportType(ReportType.Daily);
		
		assertEquals(ReportType.Daily, objdaily.getReportType());
	}
	
	
	@Test
	public void GeneratemEthodShoudReturnTicketCollectionFOrReport()
	{
		
          TicketManagement  ticketManagement=new TicketManagement();
          
          List<Ticket>  tickets=new  ArrayList<Ticket>();
          
          tickets.add(new Ticket( ));
          
          //new ticket added in collection
          ticketManagement.setTicketcollection(tickets);
       
		  ReportManagement  reportmanagement=new  ReportManagement(ticketManagement);
	
		  List<Ticket>  list= reportmanagement.generateReport(ReportType.Hourly);
	    	

			assertEquals(list.size(), 1);
		
	}
	
	@Test
	public void reportShouldreturnMonthlyReportbasedOnMonthlyChoiseSelection()
	
	{
		
		TicketManagement  ticketmanagement=new TicketManagement();
		
		ReportManagement  reportmanagement=new  ReportManagement(ticketmanagement);
		
		Report  report=ReportCreator.getReport(ReportType.Weekly);
	
		MonthlyReport objMonthly=new MonthlyReport();
		
		objMonthly.setReportType(ReportType.Monthly);
		
		assertEquals(ReportType.Monthly, objMonthly.getReportType());
	}
}