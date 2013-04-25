/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador;


/**
 * @author CPC-04
 *
 */
public enum TipoContratoEnum {
	
	TERMINO_INDEFINIDO(1,"tipoContratoEnum.termino.indefinido"),
	TERMINO_FIJO(2,"tipoContratoEnum.termino.fijo"),
	OPS(3,"tipoContratoEnum.ops"),
	OUTSOURCING(4,"tipoContratoEnum.outsourcing"),
	TAREA_TERMINADA(4,"tipoContratoEnum.tarea.terminada");

	
	 private int valor;
	    private String nameToken;

	    TipoContratoEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }
	
	    
	    public static TipoContratoEnum tomarTipoPorValor(int valor) {
	    	
    		if (valor == TERMINO_INDEFINIDO.getValor()) {
				return TERMINO_INDEFINIDO;
			}
			if (valor == TERMINO_FIJO.getValor()) {
				return TERMINO_FIJO;
			}   
			if (valor == OPS.getValor()) {
				return OPS;
			} 
			if (valor == OUTSOURCING.getValor()) {
				return OUTSOURCING;
			} 
			if (valor == TAREA_TERMINADA.getValor()) {
				return TAREA_TERMINADA;
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
