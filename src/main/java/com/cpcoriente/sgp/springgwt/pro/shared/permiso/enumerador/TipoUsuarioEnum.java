package com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador;


public enum TipoUsuarioEnum {
	
	ADMIN(1,"tipoUsuario.admin"),
	INVITADO(2,"tipoUsuario.invitado"),
	DIRECTOR_EJECUTIVO(3,"tipoUsuario.director.ejecutivo"),
	INTERVENTOR_TECNICO(4,"tipoUsuario.interventor.tecnico"),
	INTERVENTOR_FINANCIERO(5,"tipoUsuario.interventor.financiero"),
	ADMIN_ENTIDAD_FINANCIADORA(6,"tipoUsuario.admin.entidad.financiadora"),
	ADMIN_ENTIDAD_BENEFICIARIA(7,"tipoUsuario.admin.entidad.benificiaria"),
	ADMIN_ENTIDAD_EJECUTORA(8,"tipoUsuario.admin.entidad.ejecutora"),
	DIRECTOR_PROYECTO(9,"tipoUsuario.director.proyecto");
	
	
	 private int valor;
	    private String nameToken;

	    TipoUsuarioEnum(int valor, String nameToken) {
	        this.valor = valor;
	        this.nameToken = nameToken;
	    }

	    public static TipoUsuarioEnum tomarTipoPorValor(int valor) {
	    	
	    		if (valor == ADMIN.getValor()) {
					return ADMIN;
				}
				if (valor == INVITADO.getValor()) {
					return INVITADO;
				}   
				if (valor == DIRECTOR_EJECUTIVO.getValor()) {
					return DIRECTOR_EJECUTIVO;
				} 
				if (valor == INTERVENTOR_TECNICO.getValor()) {
					return INTERVENTOR_TECNICO;
				} 
				if (valor == INTERVENTOR_FINANCIERO.getValor()) {
					return INTERVENTOR_FINANCIERO;
				} 
				if (valor == ADMIN_ENTIDAD_FINANCIADORA.getValor()) {
					return ADMIN_ENTIDAD_FINANCIADORA;
				} 
				if (valor == ADMIN_ENTIDAD_BENEFICIARIA.getValor()) {
					return ADMIN_ENTIDAD_BENEFICIARIA;
				} 
				if (valor == ADMIN_ENTIDAD_EJECUTORA.getValor()) {
					return ADMIN_ENTIDAD_EJECUTORA;
				} 
				if (valor == DIRECTOR_PROYECTO.getValor()) {
					return DIRECTOR_PROYECTO;
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
