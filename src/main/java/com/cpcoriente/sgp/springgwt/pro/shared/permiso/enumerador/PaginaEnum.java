/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador;

/**
 * @author CPC-04
 *
 */
public enum PaginaEnum {
	
	
	//TODO Definir los nombres de las paginas o secciones sobre las cuales se otorgarán permisos
	PAGINA_1(1,"paginaEnum.pagina1"),
	PAGINA_2(2,"paginaEnum.pagina2"),
	PAGINA_3(3,"paginaEnum.pagina3"),
	PAGINA_4(4,"paginaEnum.pagina4"),
	PAGINA_5(5,"paginaEnum.pagina5"),
	PAGINA_6(6,"paginaEnum.pagina6"),
	PAGINA_7(7,"paginaEnum.pagina7"),
	PAGINA_8(8,"paginaEnum.pagina8"),
	PAGINA_9(9,"paginaEnum.pagina9");
	
	
	 private int valor;
	    private String nameToken;

	    PaginaEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }

	    public static PaginaEnum tomarTipoPorValor(int valor) {
	    	
	    		if (valor == PAGINA_1.getValor()) {
					return PAGINA_1;
				}
				if (valor == PAGINA_2.getValor()) {
					return PAGINA_2;
				}   
				if (valor == PAGINA_3.getValor()) {
					return PAGINA_3;
				} 
				if (valor == PAGINA_4.getValor()) {
					return PAGINA_4;
				} 
				if (valor == PAGINA_5.getValor()) {
					return PAGINA_5;
				} 
				if (valor == PAGINA_6.getValor()) {
					return PAGINA_6;
				} 
				if (valor == PAGINA_7.getValor()) {
					return PAGINA_7;
				} 
				if (valor == PAGINA_8.getValor()) {
					return PAGINA_8;
				} 
				if (valor == PAGINA_9.getValor()) {
					return PAGINA_9;
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
