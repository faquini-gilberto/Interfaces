package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelas;
import model.services.ContratoService;
import model.services.TaxaPayPal;

public class Fixacao {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter com os dados do Contrato");
		System.out.print("Numero :");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/mm/aaaa): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do Contrato: ");
		Double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContratoService contratoService = new ContratoService(new TaxaPayPal()); 
		
		contratoService.processaContrato(contrato, n);
		
		System.out.println("Pagamentos");
		for (Parcelas x : contrato.getParcelas()) {
			System.out.println(x);
		}	
			
			
		 
		
		
		sc.close();

	}

}
