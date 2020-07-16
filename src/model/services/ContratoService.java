package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ContratoService {

		private PagamentoOnlineService pagamentoOnlineService;

		public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
			this.pagamentoOnlineService = pagamentoOnlineService;
		}
		
		public void processaContrato(Contrato contrato, int months) {
			double valorCota = contrato.getValorTotal() / months;
			for (int i=1; i<=months; i++) {
				Date data1 = addMeses(contrato.getData(), i);
				
				double valorMes = valorCota + pagamentoOnlineService.Valor(valorCota, i);
				double cotaMes = valorMes + pagamentoOnlineService.Pagamento(valorMes);
				contrato.addParcelas(new Parcelas(data1, cotaMes));
				
			}
		}
		
		public Date addMeses(Date data, int mes) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.add(Calendar.MONTH, mes);
			return cal.getTime();
		}
}
