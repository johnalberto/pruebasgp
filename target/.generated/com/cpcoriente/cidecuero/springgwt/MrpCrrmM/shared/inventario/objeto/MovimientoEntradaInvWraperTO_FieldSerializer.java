package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MovimientoEntradaInvWraperTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.Date getFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "fecha");
  }
  
  private static void setFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "fecha", value);
  }
  
  private static java.lang.Long getIdMovimiento(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "idMovimiento");
  }
  
  private static void setIdMovimiento(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "idMovimiento", value);
  }
  
  private static java.lang.String getNombreTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "nombreTercero");
  }
  
  private static void setNombreTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "nombreTercero", value);
  }
  
  private static java.lang.String getTipoMovimiento(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "tipoMovimiento");
  }
  
  private static void setTipoMovimiento(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO.class, instance, "tipoMovimiento", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance) throws SerializationException {
    setFecha(instance, (java.util.Date) streamReader.readObject());
    setIdMovimiento(instance, (java.lang.Long) streamReader.readObject());
    setNombreTercero(instance, streamReader.readString());
    setTipoMovimiento(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO instance) throws SerializationException {
    streamWriter.writeObject(getFecha(instance));
    streamWriter.writeObject(getIdMovimiento(instance));
    streamWriter.writeString(getNombreTercero(instance));
    streamWriter.writeString(getTipoMovimiento(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.MovimientoEntradaInvWraperTO)object);
  }
  
}
