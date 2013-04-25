package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ClaseImpuestoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "nombre", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum getTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "tipo");
  }
  
  private static void setTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO.class, instance, "tipo", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setTipo(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getTipo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO)object);
  }
  
}
