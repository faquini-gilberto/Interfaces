package model.services;

//public class BrazilTaxService {
// antes da interface

public class BrazilTaxService implements TaxService{
	
	public double tax(double amount) {
		if (amount <= 100.0) {
			return 0.20;
		}
		return 0.15;
	}

}
