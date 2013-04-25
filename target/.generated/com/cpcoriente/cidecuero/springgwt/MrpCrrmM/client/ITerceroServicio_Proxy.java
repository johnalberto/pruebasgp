package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class ITerceroServicio_Proxy extends RemoteServiceProxy implements com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ITerceroServicioAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ITerceroServicio";
  private static final String SERIALIZATION_POLICY ="039F5B3352DD725A16FA2CE537EB9193";
  private static final com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ITerceroServicio_TypeSerializer SERIALIZER = new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ITerceroServicio_TypeSerializer();
  
  public ITerceroServicio_Proxy() {
    super(GWT.getModuleBaseURL(),
      "tercero", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void buscarLineaPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarLineaPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarLineaPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarLineaPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.buscarLineaPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarTerceroPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarTerceroPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarTerceroPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarTerceroPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.buscarTerceroPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarTipoDocPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarTipoDocPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarTipoDocPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarTipoDocPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.buscarTipoDocPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarTipoTerceroPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarTipoTerceroPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarTipoTerceroPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.buscarTipoTerceroPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.buscarTipoTerceroPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarLinea(java.lang.String lineaId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarLinea", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarLinea");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(lineaId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarLinea",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.cargarLinea", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarTercero(java.lang.Long terceroId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(terceroId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.cargarTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarTipoDoc(java.lang.String tipoDocId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarTipoDoc", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarTipoDoc");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(tipoDocId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarTipoDoc",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.cargarTipoDoc", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarTipoTercero(java.lang.String tipoTerceroId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarTipoTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarTipoTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(tipoTerceroId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.cargarTipoTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.cargarTipoTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearLinea(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO linea, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearLinea", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearLinea");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO/2546060900");
      streamWriter.writeObject(linea);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearLinea",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "ITerceroServicio_Proxy.crearLinea", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO tercero, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/396720511");
      streamWriter.writeObject(tercero);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.crearTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearTipoDoc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO tipoDoc, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearTipoDoc", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearTipoDoc");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263");
      streamWriter.writeObject(tipoDoc);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearTipoDoc",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "ITerceroServicio_Proxy.crearTipoDoc", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearTipoTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO tipoTercero, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearTipoTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearTipoTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120");
      streamWriter.writeObject(tipoTercero);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.crearTipoTercero",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "ITerceroServicio_Proxy.crearTipoTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarLinea(java.lang.String idLineaActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarLinea", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarLinea");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idLineaActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarLinea",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.eliminarLinea", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarTercero(java.lang.Long idTerceroActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idTerceroActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarTercero",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.eliminarTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarTipoDoc(java.lang.String idTipoDocActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarTipoDoc", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarTipoDoc");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idTipoDocActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarTipoDoc",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.eliminarTipoDoc", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarTipoTercero(java.lang.String idTipoTerceroActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarTipoTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarTipoTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idTipoTerceroActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.eliminarTipoTercero",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.eliminarTipoTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarLineasPorPadre(java.lang.String linea, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarLineasPorPadre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarLineasPorPadre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(linea);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarLineasPorPadre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarLineasPorPadre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarLineasPorPadreNull(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarLineasPorPadreNull", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarLineasPorPadreNull");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarLineasPorPadreNull",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarLineasPorPadreNull", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTerceroPorCiudad(java.lang.String ciudad, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTerceroPorCiudad", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTerceroPorCiudad");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(ciudad);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTerceroPorCiudad",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarTerceroPorCiudad", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTerceroPorTipoTercero(java.lang.String tipoTercero, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTerceroPorTipoTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTerceroPorTipoTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(tipoTercero);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTerceroPorTipoTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarTerceroPorTipoTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosLinea(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosLinea", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosLinea");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosLinea",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarTodosLinea", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosTercero(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosTercero");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarTodosTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosTipoDoc(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosTipoDoc", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosTipoDoc");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosTipoDoc",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarTodosTipoDoc", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosTipoTercero(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosTipoTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosTipoTercero");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.listarTodosTipoTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "ITerceroServicio_Proxy.listarTodosTipoTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarLinea(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO linea, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarLinea", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarLinea");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO/2546060900");
      streamWriter.writeObject(linea);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarLinea",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.modificarLinea", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO tercero, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/396720511");
      streamWriter.writeObject(tercero);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarTercero",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.modificarTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarTipoDoc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO tipoDoc, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarTipoDoc", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarTipoDoc");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263");
      streamWriter.writeObject(tipoDoc);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarTipoDoc",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.modificarTipoDoc", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarTipoTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO tipoTercero, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarTipoTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarTipoTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120");
      streamWriter.writeObject(tipoTercero);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("ITerceroServicio_Proxy.modificarTipoTercero",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "ITerceroServicio_Proxy.modificarTipoTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}