package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LineaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "descripcion", value);
  }
  
  private static java.util.List getHijosList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "hijosList");
  }
  
  private static void setHijosList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "hijosList", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "nombre", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO getPadre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "padre");
  }
  
  private static void setPadre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "padre", value);
  }
  
  private static java.util.List getTerceroList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "terceroList");
  }
  
  private static void setTerceroList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "terceroList", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum getTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "tipo");
  }
  
  private static void setTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO.class, instance, "tipo", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setHijosList(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setPadre(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO) streamReader.readObject());
    setTerceroList(instance, (java.util.List) streamReader.readObject());
    setTipo(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getHijosList(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPadre(instance));
    streamWriter.writeObject(getTerceroList(instance));
    streamWriter.writeObject(getTipo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO)object);
  }
  
}
