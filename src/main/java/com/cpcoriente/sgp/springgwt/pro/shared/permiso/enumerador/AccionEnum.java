/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador;

/**
 * @author CPC-04
 *
 */
public enum AccionEnum {
	
	CREAR(1,"accionEnum.pagina1"),
	MODIFICAR(2,"accionEnum.pagina2"),
	ELIMINAR(3,"accionEnum.pagina3"),
	CONSULTAR(4,"accionEnum.pagina4"),
	GENERAR_REPORTE(5,"accionEnum.pagina5");
	
	
	 private int valor;
	    private String nameToken;

	    AccionEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }

	    public static AccionEnum tomarTipoPorValor(int valor) {
	    	
	    		if (valor == CREAR.getValor()) {
					return CREAR;
				}
				if (valor == MODIFICAR.getValor()) {
					return MODIFICAR;
				}   
				if (valor == ELIMINAR.getValor()) {
					return ELIMINAR;
				} 
				if (valor == CONSULTAR.getValor()) {
					return CONSULTAR;
				} 
				if (valor == GENERAR_REPORTE.getValor()) {
					return GENERAR_REPORTE;
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
