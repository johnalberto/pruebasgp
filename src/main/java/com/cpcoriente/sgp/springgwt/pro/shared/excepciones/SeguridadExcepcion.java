/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.excepciones;

/**
 * @author CPC-04
 *
 */
public class SeguridadExcepcion extends Exception{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2149518622649404239L;

	public SeguridadExcepcion(Throwable cause) {
        super(cause);
    }

    public SeguridadExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public SeguridadExcepcion(String message) {
        super(message);
    }

    public SeguridadExcepcion() {
    }

}
