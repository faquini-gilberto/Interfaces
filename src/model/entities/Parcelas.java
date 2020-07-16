package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVenc;
	private Double valorParc;
	
	public Parcelas() {
	}

	public Parcelas(Date dataVenc, Double valorParc) {
		this.dataVenc = dataVenc;
		this.valorParc = valorParc;
	}

	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	public Double getValorParc() {
		return valorParc;
	}

	public void setValorParc(Double valorParc) {
		this.valorParc = valorParc;
	}

	@Override
	public String toString() {
		return sdf.format(dataVenc) + " - " + String.format("%.2f", valorParc);
	}
	
	
}
