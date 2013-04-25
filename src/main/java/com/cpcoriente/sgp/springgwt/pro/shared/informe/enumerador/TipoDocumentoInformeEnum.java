/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.enumerador;


/**
 * @author CPC-04
 *
 */
public enum TipoDocumentoInformeEnum {
	
	INFORME_PRINCIPAL(1,"tipoDocumentoInformeEnum.principal"),
	DOCUMENTO_EVIDENCIA(2,"tipoDocumentoInformeEnum.evidencia");

	private int valor;
	private String nameToken;

	TipoDocumentoInformeEnum(int valor, String nameToken) {
		this.valor = valor;
		this.nameToken = nameToken;
	}


	public static TipoDocumentoInformeEnum tomarTipoPorValor(int valor) {

		if (valor == INFORME_PRINCIPAL.getValor()) {
			return INFORME_PRINCIPAL;
		}
		if (valor == DOCUMENTO_EVIDENCIA.getValor()) {
			return DOCUMENTO_EVIDENCIA;
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
