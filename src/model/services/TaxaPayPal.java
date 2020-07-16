package model.services;

public class TaxaPayPal implements PagamentoOnlineService {
	
		private static final double TAXA_PAGAMENTO = 0.02;
		private static final double TAXA_MENSAL = 0.01;		

		@Override
		public double Pagamento(Double amount) {
			return amount * TAXA_PAGAMENTO;
		}
		
		@Override
		public double Valor(Double amount, int months) {
			return amount * TAXA_MENSAL * months;
		}

		
}
