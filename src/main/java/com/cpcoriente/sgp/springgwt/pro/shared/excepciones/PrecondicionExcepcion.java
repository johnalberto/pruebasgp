/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.excepciones;

/**
 * @author CPC-04
 *
 */
public class PrecondicionExcepcion extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1310398407453449248L;


	public PrecondicionExcepcion(Throwable cause) {
        super(cause);
    }

    public PrecondicionExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public PrecondicionExcepcion(String message) {
        super(message);
    }

    public PrecondicionExcepcion() {
    }

}
