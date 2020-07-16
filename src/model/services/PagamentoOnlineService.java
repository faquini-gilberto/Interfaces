package model.services;

public interface PagamentoOnlineService {

	double Pagamento(Double amount);
	double Valor(Double amount, int months); 
		
}
