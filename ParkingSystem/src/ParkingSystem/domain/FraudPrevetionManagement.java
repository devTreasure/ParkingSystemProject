package ParkingSystem.domain;

import ParkingSystem.Entities.Ticket;

public class FraudPrevetionManagement {

	public FraudPrevetionManagement() {

	}

	public void checkNovoidticketEnteredforPaymentAtexit() {

	}

	public void checkNoExitWithoutPay() {

	}

	public void checkNoEntryWithoutTicket() {

	}

	public void entryAndExitsgates() {
		// there must be one exit and one entry for each ticket
		// no two exits per one ticket
		// no two entry per one ticket
	}

	public Boolean isValidTicet(Ticket t) {

		return false;
	}
}
