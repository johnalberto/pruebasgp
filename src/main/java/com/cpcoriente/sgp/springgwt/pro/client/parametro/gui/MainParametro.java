package com.cpcoriente.sgp.springgwt.pro.client.parametro.gui;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.client.message.DialogError;
import com.cpcoriente.sgp.springgwt.pro.client.message.LabelMessage;
import com.cpcoriente.sgp.springgwt.pro.client.parametro.IParametroServicio;
import com.cpcoriente.sgp.springgwt.pro.client.parametro.IParametroServicioAsync;
import com.cpcoriente.sgp.springgwt.pro.client.report.ReportProperties;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;
import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;

public class MainParametro extends FormPanel {

	private DialogDetalleParametro dialogParametro = null;
	private VerticalPanel vpTablaPais = null;
	private FlexTable fTblBotonesPais = null;
	private PushButton pshbtnCrear = null;
	private PushButton pshbtnCancelar = null;
	private PushButton pshbtnImprimir = null;
	private Grid gridBuscar = null;
	private TextBox txtBuscarPorNombre = null;
	private Label lblMensajeBuscar = null;
	private PushButton pshbtnBuscar = null;

	private CellTable<ParametroGeneralTO> ctbParametro =  new CellTable<ParametroGeneralTO>();
	private final IParametroServicioAsync parametroAsync = GWT.create(IParametroServicio.class);
	private Label lbltTitulo = new Label("Cidecuero - Parametros Sistema");
	public static List<ParametroGeneralTO> listaTablaParametro = new LinkedList<ParametroGeneralTO>();
	private LabelMessage mes = GWT.create(LabelMessage.class);

	private ReportProperties rep= GWT.create(ReportProperties.class);
	private ListDataProvider<ParametroGeneralTO> dataProviderParametro= new ListDataProvider<ParametroGeneralTO>();



	
	public MainParametro() {
		
		init();
		
		getDataProviderParametro().addDataDisplay(ctbParametro);
		
		pshbtnBuscar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				buscarPorNombre();
			}
		});
		
	}
	
	private void buscarPorNombre(){
		if (txtBuscarPorNombre.getValue().trim().length() > 0) {
			parametroAsync.buscarParametrosPorDescripcion(txtBuscarPorNombre.getValue(), new AsyncCallback<List<ParametroGeneralTO>>() {
	
				public void onFailure(Throwable caught) {
					DialogError error = new DialogError(caught.getMessage());
					error.center();
					getDataProviderParametro().getList().clear();

				}
	
				public void onSuccess(List<ParametroGeneralTO> result) {
				
					getDataProviderParametro().getList().clear();
					getDataProviderParametro().getList().addAll(result);
					ctbParametro.redraw();

				}
	
			});
		} else {
			inicializarDatosTabla();
		}
	}

	
	
	
	
	private void inicializarDatosTabla() {

		parametroAsync.listarTodosParametro(new AsyncCallback<List<ParametroGeneralTO>>() {

			public void onSuccess(List<ParametroGeneralTO> result) {
				if (result != null){
					
					getDataProviderParametro().getList().clear();
					getDataProviderParametro().getList().addAll(result);
					ctbParametro.redraw();
					
				} else {
		
					DialogError error = new DialogError(mes.labelNohayRegistros());
					error.center();
				}

			}

			public void onFailure(Throwable caught) {
				DialogError error = new DialogError(caught.getMessage());
				error.center();
			}
		}); 

	}

	
	private void init (){

		
		vpTablaPais = new VerticalPanel();
		setWidget(vpTablaPais);
		vpTablaPais.setSize("918px", "310px");

		lbltTitulo = new Label("Cidecuero - Parametro");
		vpTablaPais.add(lbltTitulo);

		fTblBotonesPais = new FlexTable();
		vpTablaPais.add(fTblBotonesPais);
		fTblBotonesPais.setWidth("48px");

		pshbtnCrear = new PushButton("Crear");
		pshbtnCrear.getUpFace().setImage(new Image("botones/Agregar.png"));
		fTblBotonesPais.setWidget(0, 0, pshbtnCrear);

		pshbtnCancelar = new PushButton("Cancelar");
		pshbtnCancelar.getUpFace().setImage(new Image("botones/Cancelar.png"));
		fTblBotonesPais.setWidget(0, 1, pshbtnCancelar);

		pshbtnImprimir = new PushButton("Imprimir");
		pshbtnImprimir.getUpFace().setImage(new Image("botones/Printer.png"));
		fTblBotonesPais.setWidget(0, 2, pshbtnImprimir);

		gridBuscar = new Grid(2, 2);
		vpTablaPais.add(gridBuscar);

		txtBuscarPorNombre = new TextBox();
		gridBuscar.setWidget(0, 0, txtBuscarPorNombre);

		lblMensajeBuscar = new Label("");
		lblMensajeBuscar.setStyleName("gwt-Label-error");
		gridBuscar.setWidget(1, 0, lblMensajeBuscar);

		pshbtnBuscar = new PushButton("Buscar");
		

		pshbtnBuscar.getUpFace().setImage(new Image("botones/Ver.png"));
		gridBuscar.setWidget(0, 1, pshbtnBuscar);

		ctbParametro.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);

		Column<ParametroGeneralTO , String> editar = new Column<ParametroGeneralTO, String>(new ButtonCell() {
		

		}){

			@Override
			public String getValue(ParametroGeneralTO object) {
				return SafeHtmlUtils.fromSafeConstant(" ").asString();
			}
		};

		editar.setFieldUpdater(new FieldUpdater<ParametroGeneralTO, String>() {
			public void update(int index, ParametroGeneralTO object, String value) {
				
				dialogParametro = new DialogDetalleParametro(object);
				dialogParametro.center();

			}
		});
		ctbParametro.addColumn(editar, "Editar");


	
		TextColumn<ParametroGeneralTO> idPaisColumn = new TextColumn<ParametroGeneralTO>() {
			@Override
			public String getValue(ParametroGeneralTO pais) {
				return pais.getId();
			}
		};
		ctbParametro.addColumn(idPaisColumn, "Identificador");

		TextColumn<ParametroGeneralTO> nombrePaisColumn = new TextColumn<ParametroGeneralTO>() {
			@Override
			public String getValue(ParametroGeneralTO pais) {
				return pais.getDescripcion();
			}
		};
		ctbParametro.addColumn(nombrePaisColumn, "Nombre");
		
		Column<ParametroGeneralTO, Date> columnFecha = new Column<ParametroGeneralTO, Date>(new DateCell()) {
			@Override
			public Date getValue(ParametroGeneralTO object) {
				return object.getFechaModificacion();
			}
		};
		ctbParametro.addColumn(columnFecha, "Fecha");
		
		TextColumn<ParametroGeneralTO> columnValor = new TextColumn<ParametroGeneralTO>() {
			@Override
			public String getValue(ParametroGeneralTO object) {
				return object.getValor();
			}
		};
		ctbParametro.addColumn(columnValor, "Valor");

		paginacion();

	}

	private void paginacion() {

		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		SimplePager pager = new SimplePager(TextLocation.CENTER,pagerResources, false, 0, true);
		pager.setDisplay(ctbParametro); 
		pager.setPageSize(7);
	
		vpTablaPais.add(ctbParametro);
		ctbParametro.setWidth("867px");
		vpTablaPais.add(pager);
	}

	public ListDataProvider<ParametroGeneralTO> getDataProviderParametro() {
		return dataProviderParametro;
	}

	public void setDataProviderParametro(ListDataProvider<ParametroGeneralTO> dataProviderParametro) {
		this.dataProviderParametro = dataProviderParametro;
	}

	


}
