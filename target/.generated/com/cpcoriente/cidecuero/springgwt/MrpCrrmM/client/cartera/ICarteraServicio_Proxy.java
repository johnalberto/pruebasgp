package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.cartera;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class ICarteraServicio_Proxy extends RemoteServiceProxy implements com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.cartera.ICarteraServicioAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.cartera.ICarteraServicio";
  private static final String SERIALIZATION_POLICY ="1935A0199433AF00D6C6316372991DFB";
  private static final com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.cartera.ICarteraServicio_TypeSerializer SERIALIZER = new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.cartera.ICarteraServicio_TypeSerializer();
  
  public ICarteraServicio_Proxy() {
    super(GWT.getModuleBaseURL(),
      "cartera", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void anularFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO factura, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "anularFactura");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO/1523438286");
      streamWriter.writeObject(factura);
      helper.finish(callback, ResponseReader.BOOLEAN);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void anularPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO factura, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "anularPago");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO/2268646001");
      streamWriter.writeObject(factura);
      helper.finish(callback, ResponseReader.BOOLEAN);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarFacturaPorParametroGeneral(java.lang.Long idTercero, java.lang.String numFact, java.util.Date fechaFactIni, java.util.Date fechaFactFin, java.util.Date fechaPagoIni, java.util.Date fechaPagoFin, java.lang.Boolean aCredito, java.lang.Long idReferencia, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "buscarFacturaPorParametroGeneral");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 8);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.lang.Boolean/476441737");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idTercero);
      streamWriter.writeString(numFact);
      streamWriter.writeObject(fechaFactIni);
      streamWriter.writeObject(fechaFactFin);
      streamWriter.writeObject(fechaPagoIni);
      streamWriter.writeObject(fechaPagoFin);
      streamWriter.writeObject(aCredito);
      streamWriter.writeObject(idReferencia);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarPagoAnulado(java.lang.Long idPago, java.lang.Long idFactura, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "buscarPagoAnulado");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPago);
      streamWriter.writeObject(idFactura);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarPagoFacturaPorParametroGeneral(java.lang.Long idTercero, java.lang.String numFact, java.util.Date fechaFactIni, java.util.Date fechaFactFin, java.util.Date fechaPagoIni, java.util.Date fechaPagoFin, java.lang.Boolean aCredito, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "buscarPagoFacturaPorParametroGeneral");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.lang.Boolean/476441737");
      streamWriter.writeObject(idTercero);
      streamWriter.writeString(numFact);
      streamWriter.writeObject(fechaFactIni);
      streamWriter.writeObject(fechaFactFin);
      streamWriter.writeObject(fechaPagoIni);
      streamWriter.writeObject(fechaPagoFin);
      streamWriter.writeObject(aCredito);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarPagoPorParametroGeneral(java.lang.Long idTercero, java.lang.String numFact, java.util.Date fechaFactIni, java.util.Date fechaFactFin, java.util.Date fechaPagoIni, java.util.Date fechaPagoFin, java.lang.Long idFactura, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "buscarPagoPorParametroGeneral");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.util.Date/3385151746");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idTercero);
      streamWriter.writeString(numFact);
      streamWriter.writeObject(fechaFactIni);
      streamWriter.writeObject(fechaFactFin);
      streamWriter.writeObject(fechaPagoIni);
      streamWriter.writeObject(fechaPagoFin);
      streamWriter.writeObject(idFactura);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarFactura(java.lang.Long idFactura, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "cargarFactura");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idFactura);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarFacturaDetalle(java.lang.Long idFacturaDetalle, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "cargarFacturaDetalle");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idFacturaDetalle);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarPago(java.lang.Long idPago, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "cargarPago");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPago);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargaridFacturaImpuesto(java.lang.Long idFacturaImpuesto, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "cargaridFacturaImpuesto");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idFacturaImpuesto);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO factura, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "crearFactura");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO/1523438286");
      streamWriter.writeObject(factura);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO pago, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "crearPago");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO/2268646001");
      streamWriter.writeObject(pago);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO pago, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ICarteraServicio_Proxy", "modificarPago");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO/2268646001");
      streamWriter.writeObject(pago);
      helper.finish(callback, ResponseReader.BOOLEAN);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
