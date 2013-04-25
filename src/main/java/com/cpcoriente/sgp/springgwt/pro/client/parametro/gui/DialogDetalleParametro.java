package com.cpcoriente.sgp.springgwt.pro.client.parametro.gui;

import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.client.message.DialogError;
import com.cpcoriente.sgp.springgwt.pro.client.message.DialogExito;
import com.cpcoriente.sgp.springgwt.pro.client.message.LabelMessage;
import com.cpcoriente.sgp.springgwt.pro.client.parametro.IParametroServicio;
import com.cpcoriente.sgp.springgwt.pro.client.parametro.IParametroServicioAsync;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.DefaultFormat;

public class DialogDetalleParametro extends DialogBox {

	
	private FlexTable fltbPrincipal =null;
	private FlexTable fltbBotones =null;
	private PushButton pshbtnGuardar =null;
	private PushButton pshbtnCancelar =null;
	private FlexTable fltbContenido =null;
	private Label lblId =null;
	private TextBox txtIdentificacion =null;
	private Label lblDescripcion =null;
	private TextBox txtDescripcion =null;
	private Label lblFecha =null;
	private DateBox dtbFecha =null;
	private FlexTable fltbValor =null;
	private Label lblValor =null;
	private ListBox cmbValor = null;
	private TextBox txtValor =null;
	private LabelMessage mes = GWT.create(LabelMessage.class);
	private ParametroGeneralTO parametro;
	private String valor;
	private int indicador;
	private final IParametroServicioAsync parametroAsync = GWT.create(IParametroServicio.class);
	private DialogExito dialogExito =null;

	
	public DialogDetalleParametro(ParametroGeneralTO para) {
		
		setParametro(para);
		init();
		cargarSeleccionParametro();
		cargarInicio();
		
		pshbtnGuardar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				modificarParametro();
			}
		});
		
		
		cmbValor.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
				
			}
		});

		pshbtnCancelar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				hide();
				//prueba
			}
		});
		
	}
	

	
	private void modificarParametro(){
		
		ParametroGeneralTO para = new ParametroGeneralTO();
		para= getParametro();
		String valor;
		
		if(getIndicador()==1){
			valor = cmbValor.getValue(cmbValor.getSelectedIndex());
		}
		else{
			
			valor=txtValor.getValue();
		}
		
		if(valor.trim().isEmpty()){
			
			DialogError error = new DialogError("Debe registrar un valor valido en el Item valor");
			error.center();

		}else{
			para.setValor(valor);
			para.setFechaModificacion(new Date());
			
			parametroAsync.modificarParametro(para, new AsyncCallback<Boolean>() {
				
				public void onSuccess(Boolean result) {
					dialogExito = new DialogExito(mes.labelUpdateExito());
					dialogExito.center();
					hide();
				}
				
				public void onFailure(Throwable caught) {
					DialogError error = new DialogError(caught.getMessage());
					error.center();
				}
			});
		}
		
		
		
	}
	
	private void cargarSeleccionParametro(){
		
		String valor;
		valor=getParametro().getId();
		
		if(valor.equals("ParametroRegimenCidecuero")){
			seleccionCombo(cmbValor, getParametro().getValor());
			setIndicador(1);
			
		}
		else{
			
			txtValor.setVisible(true);
			txtValor.setValue(getParametro().getValor());
			cmbValor.setVisible(false);
			setIndicador(0);
		}
		
	}
	
	private void seleccionCombo(ListBox combo ,String elemento ){
		int index=0;

		for (int i = 0; i < combo.getItemCount(); i++) {

			if (combo.getValue(i).equals(elemento) ) {
				index= i;
				break;
			}
		}

		combo.setItemSelected(index, true);

	}

	
	
	
	private void cargarInicio(){
		
		txtDescripcion.setValue(getParametro().getDescripcion());
		txtIdentificacion.setValue(getParametro().getId());
		dtbFecha.setValue(getParametro().getFechaModificacion());
		
		txtDescripcion.setEnabled(false);
		txtIdentificacion.setEnabled(false);
		dtbFecha.setEnabled(false);
		
	}
	
	private void init(){
		
		
		setHTML("Modificar Parametro");
		
		fltbPrincipal = new FlexTable();
		setWidget(fltbPrincipal);
		fltbPrincipal.setSize("593px", "51px");
		
		fltbBotones = new FlexTable();
		fltbPrincipal.setWidget(0, 0, fltbBotones);
		
		pshbtnGuardar = new PushButton("New button");
				pshbtnGuardar.getUpFace().setImage(new Image("botones/Guardar.png"));
		fltbBotones.setWidget(0, 0, pshbtnGuardar);
		
		pshbtnCancelar = new PushButton("New button");
		
		pshbtnCancelar.getUpFace().setImage(new Image("botones/Cancelar.png"));
		fltbBotones.setWidget(0, 1, pshbtnCancelar);
		
		fltbContenido = new FlexTable();
		fltbPrincipal.setWidget(1, 0, fltbContenido);
		fltbContenido.setWidth("575px");
		
		lblId = new Label("Identificaci\u00F2n:");
		fltbContenido.setWidget(0, 0, lblId);
		
		txtIdentificacion = new TextBox();
		fltbContenido.setWidget(0, 1, txtIdentificacion);
		
		lblDescripcion = new Label("Descripci\u00F2n :");
		fltbContenido.setWidget(1, 0, lblDescripcion);
		
		txtDescripcion = new TextBox();
		fltbContenido.setWidget(1, 1, txtDescripcion);
		txtDescripcion.setWidth("427px");
		
		lblFecha = new Label("Fecha Modificacion");
		fltbContenido.setWidget(2, 0, lblFecha);
		
		dtbFecha = new DateBox();
		dtbFecha.setFormat(new DefaultFormat(DateTimeFormat.getFormat("dd-MMM-yyyy")));
		fltbContenido.setWidget(2, 1, dtbFecha);
		
		fltbValor = new FlexTable();
		fltbPrincipal.setWidget(2, 0, fltbValor);
		
		lblValor = new Label("Valor :");
		fltbValor.setWidget(0, 0, lblValor);
		
		cmbValor = new ListBox();
		
		fltbValor.setWidget(0, 1, cmbValor);
		cmbValor.setWidth("231px");
		
		txtValor = new TextBox();
		fltbValor.setWidget(0, 2, txtValor);
		txtValor.setWidth("228px");
		
	}


	public ParametroGeneralTO getParametro() {
		return parametro;
	}


	public void setParametro(ParametroGeneralTO parametro) {
		this.parametro = parametro;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	public int getIndicador() {
		return indicador;
	}



	public void setIndicador(int indicador) {
		this.indicador = indicador;
	}

}
