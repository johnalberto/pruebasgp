package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador;


public enum TipoFuncionProyectoEnum {
	
	
	FINANCIADORA(1,"tipofuncionproyecto.financiadora"),
	EJECUTORA(2,"tipofuncionproyecto.ejecutora"),
	BENEFICIARIA(3,"tipofuncionproyecto.beneficiaria");
	
	private int valor;
    private String nameToken;

    TipoFuncionProyectoEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    
    public static TipoFuncionProyectoEnum tomarTipoPorValor(int valor) {
    	
		if (valor == FINANCIADORA.getValor()) {
			return FINANCIADORA;
		}
		if (valor == EJECUTORA.getValor()) {
			return EJECUTORA;
		}   
		if (valor == BENEFICIARIA.getValor()) {
			return BENEFICIARIA;
		} 
	 
	
		return null;
		
    }

	public String getNameToken() {
	    return nameToken;
	}
	
	public int getValor() {
	    return valor;
	}

}
