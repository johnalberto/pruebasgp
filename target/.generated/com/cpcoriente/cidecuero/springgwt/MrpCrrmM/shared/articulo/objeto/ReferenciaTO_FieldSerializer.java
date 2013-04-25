package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ReferenciaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO getArticulo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "articulo");
  }
  
  private static void setArticulo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "articulo", value);
  }
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static long getArticuloId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "articuloId");
  }
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static void setArticuloId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "articuloId", value);
  }
  
  private static java.lang.Float getCantidadBase(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "cantidadBase");
  }
  
  private static void setCantidadBase(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "cantidadBase", value);
  }
  
  private static java.lang.String getCodigo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "codigo");
  }
  
  private static void setCodigo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "codigo", value);
  }
  
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "nombre", value);
  }
  
  private static java.lang.Float getPorcentaGana(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "porcentaGana");
  }
  
  private static void setPorcentaGana(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "porcentaGana", value);
  }
  
  private static java.lang.Float getStockMax(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "stockMax");
  }
  
  private static void setStockMax(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "stockMax", value);
  }
  
  private static java.lang.Float getStockMin(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "stockMin");
  }
  
  private static void setStockMin(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "stockMin", value);
  }
  
  private static java.sql.Time getTiempoPorUnidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (java.sql.Time) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "tiempoPorUnidad");
  }
  
  private static void setTiempoPorUnidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, java.sql.Time value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "tiempoPorUnidad", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO getUnidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "unidad");
  }
  
  private static void setUnidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO.class, instance, "unidad", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) throws SerializationException {
    setArticulo(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO) streamReader.readObject());
    setArticuloId(instance, streamReader.readLong());
    setCantidadBase(instance, (java.lang.Float) streamReader.readObject());
    setCodigo(instance, streamReader.readString());
    setDescripcion(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setPorcentaGana(instance, (java.lang.Float) streamReader.readObject());
    setStockMax(instance, (java.lang.Float) streamReader.readObject());
    setStockMin(instance, (java.lang.Float) streamReader.readObject());
    setTiempoPorUnidad(instance, (java.sql.Time) streamReader.readObject());
    setUnidad(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO instance) throws SerializationException {
    streamWriter.writeObject(getArticulo(instance));
    streamWriter.writeLong(getArticuloId(instance));
    streamWriter.writeObject(getCantidadBase(instance));
    streamWriter.writeString(getCodigo(instance));
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPorcentaGana(instance));
    streamWriter.writeObject(getStockMax(instance));
    streamWriter.writeObject(getStockMin(instance));
    streamWriter.writeObject(getTiempoPorUnidad(instance));
    streamWriter.writeObject(getUnidad(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO)object);
  }
  
}
