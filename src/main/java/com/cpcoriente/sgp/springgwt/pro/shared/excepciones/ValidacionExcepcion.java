/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.excepciones;

/**
 * @author CPC-04
 *
 */
public class ValidacionExcepcion extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2013056412270609519L;

	public ValidacionExcepcion(Throwable cause) {
        super(cause);
    }

    public ValidacionExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidacionExcepcion(String message) {
        super(message);
    }

    public ValidacionExcepcion() {
    }

}