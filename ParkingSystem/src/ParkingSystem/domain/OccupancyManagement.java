package ParkingSystem.domain;

public class OccupancyManagement {
	
	int parkingCapacity;
	public int currentParking;
	

	public void setParkingCapacity(int parkingCapacity) {
		this.parkingCapacity = parkingCapacity;
	}

	public void incrementOcccupancy()
	{
		this.currentParking+=1;
	}
	
	public void decrementOcccupancy()
	{
		this.currentParking-=1;
	}

	public int getParkingCapacity() {
		return parkingCapacity;
	}

	

	public int getCurrentParking() {
		return currentParking;
	}

	public void setCurrentParking(int currentParking) {
		this.currentParking = currentParking;
	}
	
	
	public Boolean isParkingfull()
	{
		if(this.currentParking <= this.parkingCapacity)
			return false;
		else
			return true;
	}
		
}
