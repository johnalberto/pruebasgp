package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class IPermisoServicio_Proxy extends RemoteServiceProxy implements com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.IPermisoServicioAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.IPermisoServicio";
  private static final String SERIALIZATION_POLICY ="7F6A980572926B524679F6098593A281";
  private static final com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.IPermisoServicio_TypeSerializer SERIALIZER = new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.IPermisoServicio_TypeSerializer();
  
  public IPermisoServicio_Proxy() {
    super(GWT.getModuleBaseURL(),
      "permiso", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void buscarAccionPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarAccionPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarAccionPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarAccionPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.buscarAccionPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarModuloPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarModuloPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarModuloPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarModuloPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.buscarModuloPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarPaginaPorNombre(java.lang.String idModulo, java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarPaginaPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarPaginaPorNombre");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idModulo);
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarPaginaPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.buscarPaginaPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarTipoUsuarioPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarTipoUsuarioPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarTipoUsuarioPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarTipoUsuarioPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.buscarTipoUsuarioPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void buscarUsuarioPorNombre(java.lang.String parteNombre, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarUsuarioPorNombre", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("buscarUsuarioPorNombre");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parteNombre);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.buscarUsuarioPorNombre",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.buscarUsuarioPorNombre", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarAccion(java.lang.String accionId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarAccion", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarAccion");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(accionId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarAccion",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.cargarAccion", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarModulo(java.lang.String moduloId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarModulo");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(moduloId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarModulo",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.cargarModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarPagina(java.lang.String pagId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarPagina");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(pagId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarPagina",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.cargarPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarTipoUsuario(java.lang.String tipoUsuarioId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarTipoUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarTipoUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(tipoUsuarioId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarTipoUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.cargarTipoUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cargarUsuario(java.lang.Long usuarioId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cargarUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(usuarioId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.cargarUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.cargarUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearAccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO accion, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearAccion", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearAccion");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134");
      streamWriter.writeObject(accion);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearAccion",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "IPermisoServicio_Proxy.crearAccion", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearLogUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO log, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearLogUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearLogUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO/3665200767");
      streamWriter.writeObject(log);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearLogUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.crearLogUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearModulo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO modulo, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearModulo");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747");
      streamWriter.writeObject(modulo);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearModulo",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "IPermisoServicio_Proxy.crearModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearPagina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO pag, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearPagina");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834");
      streamWriter.writeObject(pag);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearPagina",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "IPermisoServicio_Proxy.crearPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearPermisoAccionPagina(java.util.List ampList, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearPermisoAccionPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearPermisoAccionPagina");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(ampList);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearPermisoAccionPagina",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.crearPermisoAccionPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearTipoUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO tipoUsuario, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearTipoUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearTipoUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033");
      streamWriter.writeObject(tipoUsuario);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearTipoUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "IPermisoServicio_Proxy.crearTipoUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void crearUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO usuario, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("crearUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/3422968205");
      streamWriter.writeObject(usuario);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.crearUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.crearUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarAccion(java.lang.String idAccionActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarAccion", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarAccion");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idAccionActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarAccion",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.eliminarAccion", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarModulo(java.lang.String idModuloActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarModulo");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idModuloActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarModulo",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.eliminarModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarPagina(java.lang.String idPaginaActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarPagina");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idPaginaActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarPagina",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.eliminarPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarPermisoAccionPagina(java.lang.Long idAmpActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarPermisoAccionPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarPermisoAccionPagina");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idAmpActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarPermisoAccionPagina",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.eliminarPermisoAccionPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarTipoUsuario(java.lang.String idTipoUsuarioActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarTipoUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarTipoUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idTipoUsuarioActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarTipoUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.eliminarTipoUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void eliminarUsuario(java.lang.Long idUsuarioActual, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("eliminarUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idUsuarioActual);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.eliminarUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.eliminarUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listaLogrPor(java.util.Date fechaIni, java.util.Date fechaFin, java.lang.String idUsuario, java.lang.String idPagina, java.lang.String idAccion, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listaLogrPor", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listaLogrPor");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.util.Date/1659716317");
      streamWriter.writeString("java.util.Date/1659716317");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(fechaIni);
      streamWriter.writeObject(fechaFin);
      streamWriter.writeString(idUsuario);
      streamWriter.writeString(idPagina);
      streamWriter.writeString(idAccion);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listaLogrPor",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listaLogrPor", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarPaginaPorModulo(java.lang.String idModulo, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarPaginaPorModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarPaginaPorModulo");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idModulo);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarPaginaPorModulo",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarPaginaPorModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarPermisoAccionPagina(java.lang.String IdTipoUsuario, java.lang.String IdPagina, java.lang.String IdAccion, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarPermisoAccionPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarPermisoAccionPagina");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(IdTipoUsuario);
      streamWriter.writeString(IdPagina);
      streamWriter.writeString(IdAccion);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarPermisoAccionPagina",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarPermisoAccionPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosAccion(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosAccion", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosAccion");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosAccion",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarTodosAccion", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosAmp(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosAmp", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosAmp");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosAmp",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarTodosAmp", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosModulo(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosModulo");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosModulo",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarTodosModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosPagina(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosPagina");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosPagina",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarTodosPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosTipoUsuario(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosTipoUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosTipoUsuario");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosTipoUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarTodosTipoUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarTodosUsuario(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarTodosUsuario");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarTodosUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarTodosUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarUsuarioPorCiudad(java.lang.String idCiudad, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarUsuarioPorCiudad", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarUsuarioPorCiudad");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idCiudad);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarUsuarioPorCiudad",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarUsuarioPorCiudad", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarUsuarioPorTercero(java.lang.Long idTercero, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarUsuarioPorTercero", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarUsuarioPorTercero");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idTercero);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarUsuarioPorTercero",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarUsuarioPorTercero", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void listarUsuarioPorTipoUsuario(java.lang.String idTipoUsuario, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarUsuarioPorTipoUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listarUsuarioPorTipoUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idTipoUsuario);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.listarUsuarioPorTipoUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "IPermisoServicio_Proxy.listarUsuarioPorTipoUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarAccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO accion, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarAccion", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarAccion");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134");
      streamWriter.writeObject(accion);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarAccion",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.modificarAccion", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarModulo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO modulo, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarModulo");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747");
      streamWriter.writeObject(modulo);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarModulo",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.modificarModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarPagina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO pag, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarPagina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarPagina");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834");
      streamWriter.writeObject(pag);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarPagina",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.modificarPagina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarTipoUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO tipoUsuario, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarTipoUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarTipoUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033");
      streamWriter.writeObject(tipoUsuario);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarTipoUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.modificarTipoUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void modificarUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO usuario, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("modificarUsuario");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/3422968205");
      streamWriter.writeObject(usuario);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("IPermisoServicio_Proxy.modificarUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "IPermisoServicio_Proxy.modificarUsuario", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
