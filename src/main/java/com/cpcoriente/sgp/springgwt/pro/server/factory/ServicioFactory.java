/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio;
import com.cpcoriente.sgp.springgwt.pro.client.entidad.IEntidadServicio;
import com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio;
import com.cpcoriente.sgp.springgwt.pro.client.parametro.IParametroServicio;
import com.cpcoriente.sgp.springgwt.pro.client.permiso.IPermisoServicio;


/**
 * @author CPC-04
 *
 */
public class ServicioFactory {

	private static ServicioFactory instance;


	private synchronized static ServicioFactory newInstance() {
		return new ServicioFactory();
	}
	private BeanFactory factory;

	private ServicioFactory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-config.xml");
		factory = (BeanFactory) ctx;
	}

	public static ServicioFactory getInstance() {
		if (instance == null) {
			instance = newInstance();
		}
		return instance;
	}

	public ILocalidadServicio getLocalidadServicio() {
		return (ILocalidadServicio) factory.getBean("localidadServicio");
	}
	public IEntidadServicio getTerceroServicio() {
		return (IEntidadServicio) factory.getBean("terceroServicio");
	}

	public IPermisoServicio getPermisoServicio() {
		return (IPermisoServicio) factory.getBean("permisoServicio");
	}
	
	
	public IParametroServicio getParametroServicio() {
		return (IParametroServicio) factory.getBean("parametroServicio");
	}
	
	
	public IContabilidadServicio getContabilidadServicio() {
		return (IContabilidadServicio) factory.getBean("contabilidadServicio");
	}
	
	
	
	
}