package ParkingSystem.Test;

import static org.junit.Assert.*;

import java.io.Console;

import org.junit.Test;

import ParkingSystem.Entities.ParkingStatus;
import ParkingSystem.domain.OccupancyManagement;

public class OccupancyManagementTest {


	
	@Test
	public void  IfparkingIsFullDisplayParkingStatusFull()
	{
		OccupancyManagement  objoccupancymanager=new OccupancyManagement();
		//set the parking capacity
		objoccupancymanager.setParkingCapacity(5);
		
		objoccupancymanager.setCurrentParking(5);
		
	     assertEquals(ParkingStatus.Full, objoccupancymanager.currentparkingStatus());	   
	   
	}
	
	@Test
	public void  IfparkingIsNotFullDisplayParkingStatusOpen()
	{
		OccupancyManagement  objoccupancymanager=new OccupancyManagement();
		//set the parking capacity
		objoccupancymanager.setParkingCapacity(5);
		
		objoccupancymanager.setCurrentParking(4);
		
	     assertEquals(ParkingStatus.Open, objoccupancymanager.currentparkingStatus());	   
	   
	}
	
	
	@Test
	public void  DisplayCurrentparkingCorrectly()
	{
		
		OccupancyManagement  objoccupancymanager=new OccupancyManagement();
		//set the parking capacity
		
		objoccupancymanager.setCurrentParking(4);
		
		 assertEquals(4,objoccupancymanager.currentParkingOccupancy);	   
		   
		
	}
	
	
}