/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.excepciones;

/**
 * @author CPC-04
 *
 */
public class RecursoExcepcion extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6750550670013448938L;

	public RecursoExcepcion(Throwable cause) {
        super(cause);
    }

    public RecursoExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public RecursoExcepcion(String message) {
        super(message);
    }

    public RecursoExcepcion() {
    }
}
