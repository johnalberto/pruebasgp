package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ArticuloTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "id", value);
  }
  
  private static java.util.List getImpuClaseList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "impuClaseList");
  }
  
  private static void setImpuClaseList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "impuClaseList", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO getLinea(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "linea");
  }
  
  private static void setLinea(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "linea", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "nombre", value);
  }
  
  private static java.util.List getReferenciaList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "referenciaList");
  }
  
  private static void setReferenciaList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO.class, instance, "referenciaList", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setImpuClaseList(instance, (java.util.List) streamReader.readObject());
    setLinea(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setReferenciaList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getImpuClaseList(instance));
    streamWriter.writeObject(getLinea(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getReferenciaList(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO)object);
  }
  
}
