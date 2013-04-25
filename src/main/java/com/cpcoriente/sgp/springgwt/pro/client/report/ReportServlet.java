package com.cpcoriente.sgp.springgwt.pro.client.report;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class ReportServlet
 */

@SuppressWarnings("serial")
public class ReportServlet extends HttpServlet {
	 @Override
	  protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    String reportUnit = req.getParameter("reportTipo");
	   
	   
	   Date fechaInicio=null;
	try {
		if (req.getParameter("fechaInicio").equals("null")){
			
		}
		else{
			fechaInicio = new SimpleDateFormat("dd-MM-yyyy").parse(req.getParameter("fechaInicio"));

		}
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	   Date fechaFin=null;
	try {
		
		if (req.getParameter("fechaFin").equals("null")){
			
		}else{
			fechaFin = new SimpleDateFormat("dd-MM-yyyy").parse(req.getParameter("fechaFin"));
	
		}
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}

	    Date fecIni =  fechaInicio;
	    Date fecFin =fechaFin;
	    String reportName =  req.getParameter("reportName");
	    String bodega="";
	    bodega =req.getParameter("bodega");
	    String numDocTercero="";
	    numDocTercero=req.getParameter("numDocTercero");
	    Long idReferencia=null;
	    try {
	    idReferencia =Long.valueOf(req.getParameter("idReferencia"));

		} catch (Exception e) {
			idReferencia=0L;
		}
	    ServletContext sc = req.getSession().getServletContext();
	    String fullReportName = sc.getRealPath("report") +"/" +reportName + ".jasper";



	    Map<String, Object> paramMap = new HashMap<String, Object>();
	    
	    if(reportName.equals("reportInvActual")){
	    	
	    }
	    else{
	    	if(reportName.equals("reportEntradaPorFecha")||
	    		reportName.equals("reportSalidaPorFecha")||
	    			reportName.equals("reportGenTerceroPorFecha") ){
	    		
	    		paramMap.put("fechaInicio", fecIni);
	    		paramMap.put("fechaFin", fecFin);
	    	}
	    	else{
	    		if(reportName.equals("reportMoviPorBodegaPorFecha")){
	    			
	    			paramMap.put("pBodega", bodega);
	    			paramMap.put("fechaInicio", fecIni);
		    		paramMap.put("fechaFin", fecFin);
	    		}
	    		else{
	    			if(reportName.equals("reportTerceroPorFecha")){
	    				
		    			paramMap.put("fechaInicio", fecIni);
			    		paramMap.put("fechaFin", fecFin);
		    			paramMap.put("pTerceroNumDoc", numDocTercero);
	    			}
	    			else{
	    				if(reportName.equals("reportInvProductoPorFecha")){
	    					
	    					paramMap.put("fechaInicio", fecIni);
				    		paramMap.put("fechaFin", fecFin);
				    		paramMap.put("pReferencia", idReferencia);
	    				}
	    				else{
	    					if(reportName.equals("reportPais")||
	    						reportName.equals("reportTercero")||
	    						  reportName.equals("reportTipTercero")||
	    							reportName.equals("reportTipoDoc")||
	    							  reportName.equals("reportAccion")||
	    							    reportName.equals("reportModulo")){
	    						
	    						
	    						 if(!req.getParameter("varLike").equals("null")){
	    						    	if(req.getParameter("varLike").isEmpty()){
	    						    		paramMap.put("var", "%");
	    						    	}else{
	    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
	    						    	}
	    						    }
	    						
	    					}else{
	    						 if(reportName.equals("reportDepartamento")){
	    							 
	    							 if(!req.getParameter("varLike").equals("null")){
		    						    	if(req.getParameter("varLike").isEmpty()){
		    						    		paramMap.put("var", "%");
		    						    	}else{
		    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
		    						    	}
		    						    }
	    							 
	    							 paramMap.put("pPais", req.getParameter("pPais"));
	    						 }
	    						 else{
	    							 if(reportName.equals("reportCiudad")){
	    								 
	    								 if(!req.getParameter("varLike").equals("null")){
			    						    	if(req.getParameter("varLike").isEmpty()){
			    						    		paramMap.put("var", "%");
			    						    	}else{
			    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
			    						    	}
			    						    }
		    							 paramMap.put("pDepartamento", req.getParameter("pDepartamento"));

	    								 
	    							 }
	    							 if(reportName.equals("reportTipoDoc")){
	    								 
	    								 if(!req.getParameter("varLike").equals("null")){
			    						    	if(req.getParameter("varLike").isEmpty()){
			    						    		paramMap.put("var", "%");
			    						    	}else{
			    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
			    						    	}
			    						    }
	    							 }else{
	    								 if(reportName.equals("reportTipTercero")){
	    									
	    									 if(!req.getParameter("varLike").equals("null")){
				    						    	if(req.getParameter("varLike").isEmpty()){
				    						    		paramMap.put("var", "%");
				    						    	}else{
				    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
				    						    	}
				    						    }

	    								 }
	    								 else{
	    									 if(reportName.equals("reportTercero")){
	    										 
	    										 if(!req.getParameter("varLike").equals("null")){
					    						    	if(req.getParameter("varLike").isEmpty()){
					    						    		paramMap.put("var", "%");
					    						    	}else{
					    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
					    						    	}
					    						    }

	    									 }else{
	    										 if(reportName.equals("reportAccion")){
	    											 
	    											 if(!req.getParameter("varLike").equals("null")){
						    						    	if(req.getParameter("varLike").isEmpty()){
						    						    		paramMap.put("var", "%");
						    						    	}else{
						    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
						    						    	}
						    						    }
	    										 }else{
	    											 if(reportName.equals("reportModulo")){
	    												 
	    												 if(!req.getParameter("varLike").equals("null")){
							    						    	if(req.getParameter("varLike").isEmpty()){
							    						    		paramMap.put("var", "%");
							    						    	}else{
							    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
							    						    	}
							    						    }

	    												 
	    											 }else{
	    												 if(reportName.equals("reportPagina")){
	    													 
	    													 if(!req.getParameter("varLike").equals("null")){
								    						    	if(req.getParameter("varLike").isEmpty()){
								    						    		paramMap.put("var", "%");
								    						    	}else{
								    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
								    						    	}
								    						    }
	    													 
	    					    							 paramMap.put("pModulo", req.getParameter("pModulo"));

	    												 }else{
	    													 if(reportName.equals("reportTipoUsuario")){
	    														 
	    														 if(!req.getParameter("varLike").equals("null")){
									    						    	if(req.getParameter("varLike").isEmpty()){
									    						    		paramMap.put("var", "%");
									    						    	}else{
									    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
									    						    	}
									    						    }
	    														 
	    													 }else{
	    														 if(reportName.equals("reportAccionModuloPagina")){
	    															
	    															 if(!req.getParameter("varLike").equals("null")){
										    						    	if(req.getParameter("varLike").isEmpty()){
										    						    		paramMap.put("var", "%");
										    						    	}else{
										    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
										    						    	}
										    						    }
	    															 
	    	    					    							 paramMap.put("pTipoUsuario", req.getParameter("pTipoUsuario"));

	    														 }else{
	    															 if(reportName.equals("reportUsuario")){
	    																 
	    																 if(!req.getParameter("varLike").equals("null")){
											    						    	if(req.getParameter("varLike").isEmpty()){
											    						    		paramMap.put("var", "%");
											    						    	}else{
											    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
											    						    	}
											    						    } 
	    															 }else{
	    																 if(reportName.equals("reportLineaArticulo")){
	    																	 
	    																	 if(!req.getParameter("varLike").equals("null")){
												    						    	if(req.getParameter("varLike").isEmpty()){
												    						    		paramMap.put("var", "%");
												    						    	}else{
												    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
												    						    	}
												    						    }
	    	    	    					    							 paramMap.put("pTipo", req.getParameter("pTipo"));


	    																 }else
	    																	 if(reportName.equals("reportArticulo")){
	    																		 
	    																		 if(!req.getParameter("varLike").equals("null")){
													    						    	if(req.getParameter("varLike").isEmpty()){
													    						    		paramMap.put("var", "%");
													    						    	}else{
													    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
													    						    	}
													    						    }
		    	    	    					    							 paramMap.put("pLinea", req.getParameter("pLinea"));
	    																		 
	    																	 }else{
	    																		 if(reportName.equals("reportUnidad")){
	    																			 
	    																			 if(!req.getParameter("varLike").equals("null")){
														    						    	if(req.getParameter("varLike").isEmpty()){
														    						    		paramMap.put("var", "%");
														    						    	}else{
														    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
														    						    	}
														    						    }
	    																		 }
	    																		 else{
	    																			 if(reportName.equals("reportReferencia")){
	    																				 
	    																				 if(!req.getParameter("varLike").equals("null")){
	 													    						    	if(req.getParameter("varLike").isEmpty()){
	 													    						    		paramMap.put("var", "%");
	 													    						    	}else{
	 													    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
	 													    						    	}
	 													    						    }
	    																				 
	    																				   Long idArticulo=null;
	    																				    try {
	    																				    	idArticulo =Long.valueOf(req.getParameter("pArticulo"));

	    																					} catch (Exception e) {
	    																						idArticulo=0L;
	    																					}
	    																				    paramMap.put("pArticulo",idArticulo );
	    																				 
	    																			 }else{
	    																				 if(reportName.equals("reportClasesImpuestos")){
	    																					 
	    																					 if(!req.getParameter("varLike").equals("null")){
	 	 													    						    	if(req.getParameter("varLike").isEmpty()){
	 	 													    						    		paramMap.put("var", "%");
	 	 													    						    	}else{
	 	 													    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
	 	 													    						    	}
	 	 													    						    }
	    																					 
	    																				 }else{
	    																					 if(reportName.equals("reportImpuestos")){
	    																						
	    																						 if(!req.getParameter("varLike").equals("null")){
	 	 	 													    						    	if(req.getParameter("varLike").isEmpty()){
	 	 	 													    						    		paramMap.put("var", "%");
	 	 	 													    						    	}else{
	 	 	 													    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
	 	 	 													    						    	}
	 	 	 													    						    }
	    																						 
	    																					 }else{
	    																						 if(reportName.equals("reportImpuestosPorClase")){
	    																							 
	    																							 if(!req.getParameter("varLike").equals("null")){
	 	 	 	 													    						    	if(req.getParameter("varLike").isEmpty()){
	 	 	 	 													    						    		paramMap.put("var", "%");
	 	 	 	 													    						    	}else{
	 	 	 	 													    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
	 	 	 	 													    						    	}
	 	 	 	 													    						    }
	    																							 
	    																							 Long idArticulo=null;
	    		    																				    try {
	    		    																				    	idArticulo =Long.valueOf(req.getParameter("pArticulo"));

	    		    																					} catch (Exception e) {
	    		    																						idArticulo=0L;
	    		    																					}
	    		    																				    paramMap.put("pArticulo",idArticulo );
	    																							 
	    																						 }else{
	    																							 if(reportName.equals("reportRequerimientoEstado")){
	    																								 
	    																								 int estado=0;
		    		    																				    try {
		    		    																				    	estado =Integer.valueOf(req.getParameter("pEstado"));

		    		    																					} catch (Exception e) {
		    		    																						estado=0;
		    		    																					}
		    		    																				    paramMap.put("pEstado",estado );
		    																							 

	    																							 }
	    																							 else{
	    																								 if(reportName.equals("reportRequerimientoTercero")){
	    																									
	    																									Long tercero=null;
	 	    		    																				    try {
	 	    		    																				    	tercero =Long.valueOf(req.getParameter("pTercero"));

	 	    		    																					} catch (Exception e) {
	 	    		    																						tercero=0L;
	 	    		    																					}
	 	    		    																				    paramMap.put("pTercero",tercero );
	    																									 
	    																								 }
	    																								 else{
	    																									 if(reportName.equals("reportRequerimientoPorFecha")){
	    																										 
	    																											paramMap.put("fechaInicio", fecIni);
	    																								    		paramMap.put("fechaFin", fecFin);
	    																									 }else{
	    																										 if(reportName.equals("reportRequerimientoReferencia")){
	    																											 
	    																												Long referencia=null;
	    		 	    		    																				    try {
	    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pReferencia"));

	    		 	    		    																					} catch (Exception e) {
	    		 	    		    																						referencia=0L;
	    		 	    		    																					}
	    		 	    		    																				    paramMap.put("pReferencia",referencia );
	    																											 
	    																										 }else{
	    																											 if(reportName.equals("reportRequerimientoTipo")){
	    																												 
	    																												 int tipo=0;
	    				    		    																				    try {
	    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    				    		    																					} catch (Exception e) {
	    				    		    																						tipo=0;
	    				    		    																					}
	    				    		    																				    paramMap.put("pTipo",tipo );
	    																												 
	    																											 }else{
	    																												 if(reportName.equals("reportRequerimientoTipoPorFecha")){
	    																													 
	    																													 int tipo=0;
		    				    		    																				    try {
		    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

		    				    		    																					} catch (Exception e) {
		    				    		    																						tipo=0;
		    				    		    																					}
		    				    		    																				    paramMap.put("pTipo",tipo );
		    				    		    																				    paramMap.put("fechaInicio", fecIni);
		    	    																								    		paramMap.put("fechaFin", fecFin);
	    																													 
	    																												 }else{
	    																													 if(reportName.equals("reportRequeGlobalEstado")){
	    																														 
	    																														 int estado=0;
			    				    		    																				    try {
			    				    		    																				    	estado =Integer.valueOf(req.getParameter("pEstado"));

			    				    		    																					} catch (Exception e) {
			    				    		    																						estado=0;
			    				    		    																					}
			    				    		    																				    paramMap.put("pEstado",estado );
	    																														 
	    																													 }
	    																													 else{
	    																														 if(reportName.equals("reportRequeGlobalPorFecha")){
	    																															  paramMap.put("fechaInicio", fecIni);
	  		    	    																								    		paramMap.put("fechaFin", fecFin);
	    																														 }
	    																														 else{
	    																															 if(reportName.equals("reportRequeGlobalReferencia")){
	    																																 
	    																																 Long referencia=null;
	    				    		 	    		    																				    try {
	    				    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pReferencia"));

	    				    		 	    		    																					} catch (Exception e) {
	    				    		 	    		    																						referencia=0L;
	    				    		 	    		    																					}
	    				    		 	    		    																				    paramMap.put("pReferencia",referencia );
	    																																 
	    																															 }
	    																															 else{
	    																																 if(reportName.equals("reportRequeGlobalTipo")){
	    																																	
	    																																	 int tipo=0;
	    				    				    		    																				    try {
	    				    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    				    				    		    																					} catch (Exception e) {
	    				    				    		    																						tipo=0;
	    				    				    		    																					}
	    				    				    		    																				    paramMap.put("pTipo",tipo );
	    																																	 
	    																																 }
	    																																 else{
	    																																	 if(reportName.equals("reportRequeGlobalTipoPorFecha")){
	    																																		
	    																																		 int tipo=0;
	    					    				    		    																				    try {
	    					    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    					    				    		    																					} catch (Exception e) {
	    					    				    		    																						tipo=0;
	    					    				    		    																					}
	    					    				    		    																				    paramMap.put("pTipo",tipo );
	    					    				    		    																				    paramMap.put("fechaInicio", fecIni);
	    					    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																		 
	    																																	 }else{
	    																																		 
	    																																		 if(reportName.equals("reportRequisicionEstado")){
	    																																			 
	    																																			 int estado=0;
	    						    				    		    																				    try {
	    						    				    		    																				    	estado =Integer.valueOf(req.getParameter("pEstado"));

	    						    				    		    																					} catch (Exception e) {
	    						    				    		    																						estado=0;
	    						    				    		    																					}
	    						    				    		    																				    paramMap.put("pEstado",estado );
	    				    																														 
	    																																			 
	    																																		 }else{
	    																																			 if(reportName.equals("reportRequisicionPorFecha")){
	    																																				 
	    																																				 paramMap.put("fechaInicio", fecIni);
	    					  		    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																				 
	    																																			 }else{
	    																																				 if(reportName.equals("reportRequisicionReferencia")){
	    																																					 
	    																																					 
	    																																					 Long referencia=null;
	    				    				    		 	    		    																				    try {
	    				    				    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pReferencia"));

	    				    				    		 	    		    																					} catch (Exception e) {
	    				    				    		 	    		    																						referencia=0L;
	    				    				    		 	    		    																					}
	    				    				    		 	    		    																				    paramMap.put("pReferencia",referencia );
	    																																					 
	    																																					 
	    																																				 }else{
	    																																					 if(reportName.equals("reportRequisicionTipo")){
	    																																						 
	    																																						 int tipo=0;
	    				    				    				    		    																				    try {
	    				    				    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    				    				    				    		    																					} catch (Exception e) {
	    				    				    				    		    																						tipo=0;
	    				    				    				    		    																					}
	    				    				    				    		    																				    paramMap.put("pTipo",tipo );
	    																																						 
	    																																						 
	    																																					 }else{
	    																																						 if(reportName.equals("reportRequisicionTipoPorFechas")){
	    																																							 
	    																																							 	
	    				    																																		 int tipo=0;
	    				    					    				    		    																				    try {
	    				    					    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    				    					    				    		    																					} catch (Exception e) {
	    				    					    				    		    																						tipo=0;
	    				    					    				    		    																					}
	    				    					    				    		    																				    paramMap.put("pTipo",tipo );
	    				    					    				    		    																				    paramMap.put("fechaInicio", fecIni);
	    				    					    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																							 
	    																																						 }else{
	    																																							 
	    																																							 if(reportName.equals("reportRequiGlobalEstado")){
	    																																								
	    																																								 int estado=0;
	    				    						    				    		    																				    try {
	    				    						    				    		    																				    	estado =Integer.valueOf(req.getParameter("pEstado"));

	    				    						    				    		    																					} catch (Exception e) {
	    				    						    				    		    																						estado=0;
	    				    						    				    		    																					}
	    				    						    				    		    																				    paramMap.put("pEstado",estado );
	    				    						    				    		    																				    
	    																																							 }else{
	    																																								 if(reportName.equals("reportRequiGlobalPorFecha")){
	    																																									 
	    																																									 paramMap.put("fechaInicio", fecIni);
	    				    					  		    	    																								    	 paramMap.put("fechaFin", fecFin);
	    				    																																				
	    																																									 
	    																																								 }else{
	    																																									 if(reportName.equals("reportRequiGlobalReferencia")){
	    																																										 
	    				    																																					 Long referencia=null;
	    				    				    				    		 	    		    																				    try {
	    				    				    				    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pReferencia"));

	    				    				    				    		 	    		    																					} catch (Exception e) {
	    				    				    				    		 	    		    																						referencia=0L;
	    				    				    				    		 	    		    																					}
	    				    				    				    		 	    		    																				    paramMap.put("pReferencia",referencia );
	    																																										 
	    																																									 }else{
	    																																										 if(reportName.equals("reportRequiGlobalTipo")){
	    																																											 
	    				    																																						 int tipo=0;
	    				    				    				    				    		    																				    try {
	    				    				    				    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    				    				    				    				    		    																					} catch (Exception e) {
	    				    				    				    				    		    																						tipo=0;
	    				    				    				    				    		    																					}
	    				    				    				    				    		    																				    paramMap.put("pTipo",tipo );
	    																																											 
	    																																										 }else{
	    																																											 if(reportName.equals("reportRequiGlobalTipoPorFechas")){
	    																																												 
	    																																												 int tipo=0;
	    				    				    					    				    		    																				    try {
	    				    				    					    				    		    																				    	tipo =Integer.valueOf(req.getParameter("pTipo"));

	    				    				    					    				    		    																					} catch (Exception e) {
	    				    				    					    				    		    																						tipo=0;
	    				    				    					    				    		    																					}
	    				    				    					    				    		    																				    paramMap.put("pTipo",tipo );
	    				    				    					    				    		    																				    paramMap.put("fechaInicio", fecIni);
	    				    				    					    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																												 
	    																																											 }else{
	    																																												 
	    																																												 if(reportName.equals("reportCotizacionRequiGlobal")){
	    																																													 
	    																																													 Long requiGlobal=null;
	    		    				    				    				    		 	    		    																				    try {
	    		    				    				    				    		 	    		    																				    	requiGlobal =Long.valueOf(req.getParameter("pRequiGlobal"));

	    		    				    				    				    		 	    		    																					} catch (Exception e) {
	    		    				    				    				    		 	    		    																						requiGlobal=0L;
	    		    				    				    				    		 	    		    																					}
	    		    				    				    				    		 	    		    																				    paramMap.put("pRequiGlobal",requiGlobal );
	    		    																											
	    																																													 
	    																																												 }else{
	    																																													 if(reportName.equals("reportCotizacionTercero")){
	    																																														 
	    																																														 Long referencia=null;
		    		    				    				    				    		 	    		    																				    try {
		    		    				    				    				    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pTercero"));

		    		    				    				    				    		 	    		    																					} catch (Exception e) {
		    		    				    				    				    		 	    		    																						referencia=0L;
		    		    				    				    				    		 	    		    																					}
		    		    				    				    				    		 	    		    																				    paramMap.put("pTercero",referencia );
		    		    																									
	    																																														 
	    																																													 }
	    																																													 else{
	    																																														 
	    																																														 if(reportName.equals("reportCotizacionFechaEval")){
	    																																															 

	    		    				    				    					    				    		    																				    paramMap.put("fechaInicio", fecIni);
	    		    				    				    					    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																															 
	    																																														 }else{
	    																																															 
	    																																															 if(reportName.equals("reportCotizacionFechaReg")){
	    																																																 
	    																																																 
	    																									  		    																				    paramMap.put("fechaInicio", fecIni);
		    		    				    				    					    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																																 
	    																																															 }else{
	    																																																 
	    																																																 if(reportName.equals("reportCotizacionDescripcion")){
	    																																																	 
	    																																																	 if(!req.getParameter("varLike").equals("null")){
	    																										 	 	 	 													    						    	if(req.getParameter("varLike").isEmpty()){
	    																										 	 	 	 													    						    		paramMap.put("var", "%");
	    																										 	 	 	 													    						    	}else{
	    																										 	 	 	 													    						    		paramMap.put("var", "%"+req.getParameter("varLike")+"%");
	    																										 	 	 	 													    						    	}
	    																										 	 	 	 													    						    }
	    																																																	 
	    																																																 }else{
	    																																																	 
	    																																																	 if(reportName.equals("reportCotizacionReferencia")){
	    																																																		 
	    																																																		 Long referencia=null;
	    				    		    				    				    				    		 	    		    																				    try {
	    				    		    				    				    				    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pReferencia"));

	    				    		    				    				    				    		 	    		    																					} catch (Exception e) {
	    				    		    				    				    				    		 	    		    																						referencia=0L;
	    				    		    				    				    				    		 	    		    																					}
	    				    		    				    				    				    		 	    		    																				    paramMap.put("pReferencia",referencia );
	    				    		    																								
	    																																																		 
	    																																																	 }else{
	    																																																		 
	    																																																		 if(reportName.equals("reportPedidoEstado")){
	    																																																			 
	    																																																			 int estado=0;
	    										    				    						    				    		    																				    try {
	    										    				    						    				    		    																				    	estado =Integer.valueOf(req.getParameter("pEstado"));

	    										    				    						    				    		    																					} catch (Exception e) {
	    										    				    						    				    		    																						estado=0;
	    										    				    						    				    		    																					}
	    										    				    						    				    		    																				    paramMap.put("pEstado",estado );

	    																																																		 }else{
	    																																																			 
	    																																																			 if(reportName.equals("reportPedidoTercero")){
	    																																																				 
	    																																																				 Long tercero=null;
	    						    		    				    				    				    		 	    		    																				    try {
	    						    		    				    				    				    		 	    		    																				    	tercero =Long.valueOf(req.getParameter("pTercero"));

	    						    		    				    				    				    		 	    		    																					} catch (Exception e) {
	    						    		    				    				    				    		 	    		    																						tercero=0L;
	    						    		    				    				    				    		 	    		    																					}
	    						    		    				    				    				    		 	    		    																				    paramMap.put("pTercero",tercero );
	    						    		    				    				    				    		 	    		    																				    
	    																																																			 }else{
	    																																																				 
	    																																																				 if(reportName.equals("reportPedidoReferencia")){
	    																																																					
	    																																																					 Long referencia=null;
	    		    				    		    				    				    				    		 	    		    																				    try {
	    		    				    		    				    				    				    		 	    		    																				    	referencia =Long.valueOf(req.getParameter("pReferencia"));

	    		    				    		    				    				    				    		 	    		    																					} catch (Exception e) {
	    		    				    		    				    				    				    		 	    		    																						referencia=0L;
	    		    				    		    				    				    				    		 	    		    																					}
	    		    				    		    				    				    				    		 	    		    																				    paramMap.put("pReferencia",referencia );
	    																																																					 
	    																																																				 }else{
	    																																																					 if(reportName.equals("reportPedidoPorFecha")){
	    																																																						 
	    																																																						 
	    					    																									  		    																				    paramMap.put("fechaInicio", fecIni);
	    						    		    				    				    					    	    																								    		paramMap.put("fechaFin", fecFin);
	    																																																					 }else{
	    																																																						 if(reportName.equals("reportCarteraPagoTerceroDetalle")){
	    																																																							 
	    																																																							 
	    																																																							 Long tercero=null;
	    		    						    		    				    				    				    		 	    		    																				    try {
	    		    						    		    				    				    				    		 	    		    																				    	tercero =Long.valueOf(req.getParameter("pTercero"));

	    		    						    		    				    				    				    		 	    		    																					} catch (Exception e) {
	    		    						    		    				    				    				    		 	    		    																						tercero=0L;
	    		    						    		    				    				    				    		 	    		    																					}
	    		    						    		    				    				    				    		 	    		    																				    paramMap.put("pTercero",tercero );

	    																																																						 }else{
	    																																																							 if(reportName.equals("reportCarteraTerceroDias")){
	    																																																								 
	    																																																								 Long tercero=null;
		    		    						    		    				    				    				    		 	    		    																				    try {
		    		    						    		    				    				    				    		 	    		    																				    	tercero =Long.valueOf(req.getParameter("pTercero"));

		    		    						    		    				    				    				    		 	    		    																					} catch (Exception e) {
		    		    						    		    				    				    				    		 	    		    																						tercero=0L;
		    		    						    		    				    				    				    		 	    		    																					}
		    		    						    		    				    				    				    		 	    		    																				    paramMap.put("pTercero",tercero );

	    																																																							 }else{
	    																																																								 if(reportName.equals("FacturaVenta")){
	    																																																									 
	    																																																									 Long factura=null;
			    		    						    		    				    				    				    		 	    		    																				    try {
			    		    						    		    				    				    				    		 	    		    																				    	
			    		    						    		    				    				    				    		 	    		    																				    	factura =Long.valueOf(req.getParameter("pFactura"));

			    		    						    		    				    				    				    		 	    		    																					} catch (Exception e) {
			    		    						    		    				    				    				    		 	    		    																						factura=0L;
			    		    						    		    				    				    				    		 	    		    																					}
			    		    						    		    				    				    				    		 	    		    																				    paramMap.put("pFactura",factura );

	    																																																								 }else{
	    																																																									 if(reportName.equals("pago")){
	    																																																										 
	    																																																										 
		    																																																									 Long pago=null;
		    																																																									 String valorLetras="";
				    		    						    		    				    				    				    		 	    		    																				    try {
				    		    						    		    				    				    				    		 	    		    																				    	
				    		    						    		    				    				    				    		 	    		    																				    	pago =Long.valueOf(req.getParameter("pPago"));
				    		    						    		    				    				    				    		 	    		    																				    	valorLetras=req.getParameter("valorLetras");

				    		    						    		    				    				    				    		 	    		    																					} catch (Exception e) {
				    		    						    		    				    				    				    		 	    		    																						pago=0L;
				    		    						    		    				    				    				    		 	    		    																					}
				    		    						    		    				    				    				    		 	    		    																				    paramMap.put("pPago",pago );
				    		    						    		    				    				    				    		 	    		    																				    paramMap.put("valorLetras",valorLetras );
	    																																																									 }
	    																																																								 }
	    																																																							 }
	    																																																							 
	    																																																						 }
	    																																																						 
	    																																																						 
	    																																																					 }
	    																																																					 
	    																																																				 }
	    																																																				 
	    																																																			 }
	    																																																		 }
	    																																																	 }
	    																																																	 
	    																																																 }
	    																																																 
	    																																															 }
	    																																															 
	    																																														 }
	    																																														 
	    																																													 }
	    																																													 
	    																																												 }
	    																																											 }
	    																																										 }
	    																																										 
	    																																									 }
	    																																									 
	    																																								 }
	    																																								 
	    																																							 }
	    																																						 }
	    																																						 
	    																																						 
	    																																					 }
	    																																					 
	    																																				 }
	    																																				 
	    																																			 }
	    												
	    																																			 
	    																																			 
	    																																		 }
	    																																			 
	    																																			 
	    																																	 }
	    																																	 
	    																																	 
	    																																 }
	    																																 
	    																																 
	    																															 }
	    																														 }
	    																														 
	    																													 }
	    																													 
	    																												 }
	    																												 
	    																											 }
	    																										 }
	    																									 }
	    																								 }
	    																							 }
	    																						 }
	    																					 }
	    																				 }
	    																			 }
	    																		 }
	    																	 }
	    															 }
	    															 
	    														 }
	    														 
	    														 
	    													 }
	    													 	    													 
	    												 }
	    												 
	    											 }
	    											 
	    										 }
	    									 }
	    								 }
	    							 }
	    						 }
	    					}
	    					
	    				}
	    			}
	    			
	    		}
	    		
	    	}
	    	
	    }
	    

	    System.out.println("Variable Like--->"+req.getParameter("varLike"));
	    Iterator it = paramMap.entrySet().iterator();

	    while (it.hasNext()) {
	    	Map.Entry e = (Map.Entry)it.next();
	    	System.out.println(e.getKey() + " " + e.getValue());
	    }
	    
	    JRExporter exporter = null;
	    JasperPrint jasperPrint = null;
	    
	    Connection connection=null;
		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.4/cidecueromrpbd","john", "abc123");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	    
	    try {
	      File reportFile = new File(fullReportName);
	      if (!reportFile.exists()) {
	        System.err.println("File " + fullReportName + " not found.");
	      } else {
	        JasperReport jasperReport;
	        jasperReport=  (JasperReport) JRLoader.loadObject(fullReportName);
	        jasperPrint = JasperFillManager.fillReport(jasperReport, paramMap,connection);
	      }
	    } catch (JRException e) {
	      e.printStackTrace();
	    }
	    
	   
	    if (reportUnit != null) {

	      if (reportUnit.equals("Html")) {
	        res.setContentType("text/html");
	        res.setCharacterEncoding("UTF-8");
	        exporter = new JRHtmlExporter();
	        exporter.setParameter(JRHtmlExporterParameter.IS_USING_IMAGES_TO_ALIGN, Boolean.FALSE);
	        exporter.setParameter(JRHtmlExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);

	      } else if (reportUnit.equals("PDF")) {
	        res.setContentType("application/pdf");
	        exporter = new JRPdfExporter();

	      } else if (reportUnit.equals("Excel")) {
	        res.setContentType("application/vnd.ms-excel");
	        res.setHeader("Content-Disposition", "inline; filename=" + reportName + ".xls");
	        exporter = new JExcelApiExporter();
	        exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, Boolean.TRUE);
	        exporter.setParameter(JRXlsExporterParameter.CHARACTER_ENCODING, "UTF-8");

	      } else if (reportUnit.equals("CSV")) {
	        res.setContentType("application/vnd.ms-excel");
	        res.setHeader("Content-Disposition", "inline; filename=" + reportName + ".csv");
	        exporter = new JRCsvExporter();
	      }

	      OutputStream stream = null;
	      try {
	        stream = res.getOutputStream();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }

	     
	      exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, stream);
	      exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	      exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");

	      try {
	        exporter.exportReport();
	        stream.close();
	      } catch (JRException e) {
	        e.printStackTrace();
	      }
	    } else {
	      System.err.println("Unknown report unit type!");
	    }

	  }

}
