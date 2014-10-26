package ParkingSystem.domain;

public class OccupancyManagement {
	
	int parkingCapacity;
	public int currentParkingOccupancy;
	

	public void setParkingCapacity(int parkingCapacity) {
		this.parkingCapacity = parkingCapacity;
	}

	public void incrementOcccupancy()
	{
		this.currentParkingOccupancy+=1;
	}
	
	public void decrementOcccupancy()
	{
		this.currentParkingOccupancy-=1;
	}

	public int getParkingCapacity() {
		return parkingCapacity;
	}

	

	public int getCurrentParking() {
		return currentParkingOccupancy;
	}

	public void setCurrentParking(int currentParking) {
		this.currentParkingOccupancy = currentParking;
	}
	
	
	public Boolean isParkingfull()
	{
		if(this.currentParkingOccupancy <= this.parkingCapacity)
			return false;
		else
			return true;
	}
		
}
