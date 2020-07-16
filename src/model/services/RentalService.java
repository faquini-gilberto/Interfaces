package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	//private BrazilTaxService taxService;  antes Interface
	private TaxService taxService;
	
	public RentalService() {
	}

	//public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) { antes da Interface
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long T1 = carRental.getStart().getTime();
		long T2 = carRental.getFinish().getTime();
		double hours = (double)(T2 - T1) / 1000 / 60 / 60;
		
		double basicPayment;
		
		if (hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
