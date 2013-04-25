package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class InventarioActualPrecioReflWraper_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.Long getIdReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper.class, instance, "idReferencia");
  }
  
  private static void setIdReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper.class, instance, "idReferencia", value);
  }
  
  private static java.lang.Double getPrecioPromedio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instance) {
    return (java.lang.Double) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper.class, instance, "precioPromedio");
  }
  
  private static void setPrecioPromedio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instance, java.lang.Double value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper.class, instance, "precioPromedio", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instance) throws SerializationException {
    setIdReferencia(instance, (java.lang.Long) streamReader.readObject());
    setPrecioPromedio(instance, (java.lang.Double) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper instance) throws SerializationException {
    streamWriter.writeObject(getIdReferencia(instance));
    streamWriter.writeObject(getPrecioPromedio(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualPrecioReflWraper)object);
  }
  
}
