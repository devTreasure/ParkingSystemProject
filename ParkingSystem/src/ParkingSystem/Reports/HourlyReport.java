package ParkingSystem.Reports;

import java.util.List;

import ParkingSystem.Entities.ReportType;
import ParkingSystem.Entities.Ticket;

public class HourlyReport implements Report {
	
	
	private ReportType  reportType;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((reportType == null) ? 0 : reportType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HourlyReport other = (HourlyReport) obj;
		if (reportType != other.reportType)
			return false;
		return true;
	}
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
