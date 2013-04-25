package com.cpcoriente.sgp.springgwt.pro.client.message;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class DialogInfo extends DialogBox {
	
	private String mensaje;
	FlexTable flexTable = new FlexTable();
	Image imgIcono = new Image();
	Label lblMensaje = new Label();
	private final Button btnAceptar = new Button("Aceptar");

	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public DialogInfo(String mensaje) {
		this.mensaje= mensaje;
		init();
		
		btnAceptar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				hide();
			}
		});
		
	}
	
	private void init()
	{
		setHTML("Mensaje Error");
		setWidget(flexTable);
		flexTable.setSize("88px", "102px");
		imgIcono.setUrl("botones/mensajes/Informacion.png");
		flexTable.setWidget(0, 0, imgIcono);
		flexTable.setWidget(1, 0, lblMensaje);
		flexTable.setWidget(2, 0, btnAceptar);
		this.lblMensaje.setText(this.mensaje);
	}

	
}
