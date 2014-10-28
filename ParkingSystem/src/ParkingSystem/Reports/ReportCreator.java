package ParkingSystem.Reports;

public class ReportCreator {
	
	public static Report  getReport(int reportType)
	{
	  if(reportType==1)
		  return  new HourlyReport();
	  else if(reportType==2)
		  return  new DailyReport();
	  else if(reportType==3)
		  return new WeeklyReport();
	  else if(reportType==4)
		  return new MonthlyReport();
	  else
		  return new  MonthlyReport();
	}

}
