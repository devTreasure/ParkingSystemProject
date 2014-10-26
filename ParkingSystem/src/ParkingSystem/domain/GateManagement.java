package ParkingSystem.domain;
import java.util.ArrayList;
import java.util.List;

import ParkingSystem.Entities.EntryGate;
import ParkingSystem.Entities.ExitGate;
import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.GateStatus;


public class GateManagement {
	
	private Gate gate ;
	
	private List<Gate> gateMovementcollection  =   new ArrayList<Gate>();  
	
	
	public Gate OpenGate(int gateid)
	{
		Gate objGate=new  EntryGate(gateid);
		this.gate=objGate;
		this.gate.gateStatus=GateStatus.Open;
			
		gateMovementcollection.add(objGate);
		
		return objGate;
		
		
	}
	
	
	public Gate ExitGate(int gateid)
	{
		Gate objGate=new  ExitGate(gateid);
		this.gate=objGate;
		this.gate.gateStatus=GateStatus.Open;
		
		gateMovementcollection.add(objGate);
		
		return objGate;
	}
	
	
	public void closeGate()
	{
		
		this.gate.gateStatus=GateStatus.Close;
	}

	public List<Gate> getGateMovementcollection() {
		return gateMovementcollection;
	}

	public void setGateMovementcollection(List<Gate> gateMovementcollection) {
		this.gateMovementcollection = gateMovementcollection;
	}

}
