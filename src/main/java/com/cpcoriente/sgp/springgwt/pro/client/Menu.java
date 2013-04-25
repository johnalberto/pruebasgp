package com.cpcoriente.sgp.springgwt.pro.client;



import com.cpcoriente.sgp.springgwt.pro.client.parametro.gui.MainParametro;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;


public class Menu extends FormPanel {

	
	private static final int USUARIO_REGISTRADO = 1;
	private  VerticalPanel verticalPanel = new VerticalPanel();
	RootPanel rootPanel = RootPanel.get();   

	public Menu() {


		
		//----------------------------------------------------------------------- MENU SEGURIDAD -----------------------------------------------------------------------		



		
		
		Command cmdParametro = new Command(){ 
			public void execute() {
				MainParametro mainParametro = new MainParametro();
				mainParametro.setHeight("371px");
				verticalPanel.clear();
				verticalPanel.add(mainParametro);
			}

		};


	
		MenuBar permisos = new MenuBar(true);


		MenuBar menuSeguridad = new MenuBar(true);
		menuSeguridad.addItem("Permisos",permisos);
		menuSeguridad.addItem("Parametros",cmdParametro);


		//----------------------------------------------------------------------- MENU INVENTARIO -----------------------------------------------------------------------				


	


		
	

		MenuBar producto = new MenuBar(true);
	

		MenuBar compra = new MenuBar(true);


		MenuBar requerimiento = new MenuBar(true);



		MenuBar movimientos = new MenuBar(true);



		MenuBar movInventario = new MenuBar(true);

		movInventario.addItem("Movimientos de Inventario", movimientos);

		
		

		MenuBar menuInventario = new MenuBar(true);
		menuInventario.addItem("Manejo de Productos", producto);		
		menuInventario.addItem("Manejo de Requerimientos", requerimiento);
		menuInventario.addItem("Manejo de  Compras", compra);
		menuInventario.addItem("Manejo de Inventario", movInventario);
		
		
		//----------------------------------------------------------------------- MENU CARTERA -----------------------------------------------------------------------

		

		

		

		
		MenuBar menuCartera = new MenuBar(true);


		
		
		//----------------------------------------------------------------------- MENU CONTACTENOS -----------------------------------------------------------------------
		
		

		
		
		
		MenuBar menuContactenos = new MenuBar(true);

		//-----------------------------------------------------------------------MENU PRODUCCION-------------------------------------------------------------------------
		

		MenuBar menuProduccion = new MenuBar(true);

	
		//----------------------------------------------------------------------- MENU PRINCIPAL -----------------------------------------------------------------------
		// Make a new menu bar, adding a few cascading menus to it.
		MenuBar mainMenu = new MenuBar();
		mainMenu.addItem("Seguridad", menuSeguridad);
		mainMenu.addItem("Inventario", menuInventario);
		mainMenu.addItem("Cartera", menuCartera);
		mainMenu.addItem("Contactenos", menuContactenos);
		mainMenu.addItem("Produccion", menuProduccion);


		rootPanel.add(verticalPanel, 10, 40);
		verticalPanel.setSize("655px", "775px");

		this.add(mainMenu);
	} 
}
