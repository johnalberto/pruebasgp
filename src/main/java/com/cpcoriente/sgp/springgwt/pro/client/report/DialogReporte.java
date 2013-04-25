package com.cpcoriente.sgp.springgwt.pro.client.report;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DialogReporte extends DialogBox {
	
	private VerticalPanel vpPrincipal =null;
	private String url=null;
	private String label =null;
	private Frame frameReporte =null;
	private FlexTable fltbBotones =null;
	private PushButton pshbtnCancelar =null;

	public DialogReporte(String urlReporte,String label) {
		
		setLabel(label);
		setUrl(urlReporte);
		init();
		pshbtnCancelar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				hide();
			}
		});
		
		
	}
	
	private void init(){
		setHTML(getLabel());
		
		vpPrincipal = new VerticalPanel();
		setWidget(vpPrincipal);
		vpPrincipal.setSize("909px", "527px");
		
		FlexTable fltbPrincipal = new FlexTable();
		vpPrincipal.add(fltbPrincipal);
		fltbPrincipal.setSize("56px", "34px");
		
		fltbBotones = new FlexTable();
		fltbPrincipal.setWidget(0, 0, fltbBotones);
		
		pshbtnCancelar = new PushButton("New button");
		
		pshbtnCancelar.getUpFace().setImage(new Image("botones/Cancelar.png"));
		pshbtnCancelar.setTitle("Cerrar");
		fltbBotones.setWidget(0, 0, pshbtnCancelar);
		
		frameReporte = new Frame(getUrl());
		vpPrincipal.add(frameReporte);
		frameReporte.setSize("908px", "527px");
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
