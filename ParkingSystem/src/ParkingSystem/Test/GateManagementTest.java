package ParkingSystem.Test;

import static org.junit.Assert.*;
import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.GateStatus;
import ParkingSystem.domain.GateManagement;

import org.junit.Test;

public class GateManagementTest {

    @Test
	public void whenGateOpeniscalledOutStausShoulebeOpen()
	{
		GateManagement g=new  GateManagement();
		
	    Gate gs=g.OpenEntryGate(1);
	   
		assertEquals(gs.gateStatus,GateStatus.Open);
	
	}

    @Test
   	public void whenGateClosediscalledOutStausShoulebeClosed()
   	{
   		GateManagement g=new  GateManagement();
   		
   	    Gate gs=g.closeEntryGate(1);
   	   
   		assertEquals(gs.gateStatus,GateStatus.Close);
   	
   	}

    
}
