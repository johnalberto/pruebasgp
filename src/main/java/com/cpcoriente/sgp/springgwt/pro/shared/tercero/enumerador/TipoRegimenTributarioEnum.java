/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador;

/**
 * @author CPC-04
 *
 */
public enum TipoRegimenTributarioEnum {
	GRAN_CONTRIBUYENTE(0,"regimenTributarioEnum.tercero.gran_contribuyente"),
	GRAN_CONTRIBUYENTE_AUTORRETENEDOR(1,"regimenTributarioEnum.tercero.gran_contribuyente_autorretenedor"),
	ESTADO(2,"regimenTributarioEnum.tercero.estado"),
	AUTORRETENEDOR(3,"regimenTributarioEnum.tercero.autorretenedor"),
	REGIMEN_COMUN(4,"regimenTributarioEnum.tercero.regimen_comun"),
	REGIMEN_SIMPLIFICADO(5,"regimenTributarioEnum.tercero.regimen_simplificado");
	
    private int valor;
    private String nameToken;

    TipoRegimenTributarioEnum(int valor, String nameToken) {
        this.valor = valor;
        this.nameToken = nameToken;
    }

    public static TipoRegimenTributarioEnum tomarTipoPorValor(int valor) {
    	
    		if (valor == GRAN_CONTRIBUYENTE.getValor()) {
				return GRAN_CONTRIBUYENTE;
			}
			if (valor == GRAN_CONTRIBUYENTE_AUTORRETENEDOR.getValor()) {
				return GRAN_CONTRIBUYENTE_AUTORRETENEDOR;
			}
			if (valor == ESTADO.getValor()) {
				return ESTADO;
			}
			if (valor == AUTORRETENEDOR.getValor()) {
				return AUTORRETENEDOR;
			}
			if (valor == REGIMEN_COMUN.getValor()) {
				return REGIMEN_COMUN;
			}
			if (valor == REGIMEN_SIMPLIFICADO.getValor()) {
				return REGIMEN_SIMPLIFICADO;
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
