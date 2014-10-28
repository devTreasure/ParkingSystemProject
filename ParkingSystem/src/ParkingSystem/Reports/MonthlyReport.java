package ParkingSystem.Reports;

import java.util.List;

import ParkingSystem.Entities.ReportType;
import ParkingSystem.Entities.Ticket;

public class MonthlyReport implements Report{

	private ReportType  reportType;
	
	@Override
	public List<Ticket> getReport(List<Ticket> allTickets) {
		return allTickets;
	}

	public ReportType getReportType() {
		return reportType;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}


}
