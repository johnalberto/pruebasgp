package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ImpuestoPorClaseTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO getArticulo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "articulo");
  }
  
  private static void setArticulo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "articulo", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO getClase(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "clase");
  }
  
  private static void setClase(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "clase", value);
  }
  
  private static java.util.Date getFechaFinal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "fechaFinal");
  }
  
  private static void setFechaFinal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "fechaFinal", value);
  }
  
  private static java.util.Date getFechaInicial(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "fechaInicial");
  }
  
  private static void setFechaInicial(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "fechaInicial", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "id", value);
  }
  
  private static java.lang.Float getLimitInfCobro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "limitInfCobro");
  }
  
  private static void setLimitInfCobro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "limitInfCobro", value);
  }
  
  private static java.lang.Float getLimitSupCobro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "limitSupCobro");
  }
  
  private static void setLimitSupCobro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "limitSupCobro", value);
  }
  
  private static java.lang.Float getPorcenBase(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "porcenBase");
  }
  
  private static void setPorcenBase(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "porcenBase", value);
  }
  
  private static java.lang.Float getPorcenCobra(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "porcenCobra");
  }
  
  private static void setPorcenCobra(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "porcenCobra", value);
  }
  
  private static int getTipoCobro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "tipoCobro");
  }
  
  private static void setTipoCobro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance, int value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO.class, instance, "tipoCobro", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) throws SerializationException {
    setArticulo(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO) streamReader.readObject());
    setClase(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO) streamReader.readObject());
    setFechaFinal(instance, (java.util.Date) streamReader.readObject());
    setFechaInicial(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setLimitInfCobro(instance, (java.lang.Float) streamReader.readObject());
    setLimitSupCobro(instance, (java.lang.Float) streamReader.readObject());
    setPorcenBase(instance, (java.lang.Float) streamReader.readObject());
    setPorcenCobra(instance, (java.lang.Float) streamReader.readObject());
    setTipoCobro(instance, streamReader.readInt());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO instance) throws SerializationException {
    streamWriter.writeObject(getArticulo(instance));
    streamWriter.writeObject(getClase(instance));
    streamWriter.writeObject(getFechaFinal(instance));
    streamWriter.writeObject(getFechaInicial(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getLimitInfCobro(instance));
    streamWriter.writeObject(getLimitSupCobro(instance));
    streamWriter.writeObject(getPorcenBase(instance));
    streamWriter.writeObject(getPorcenCobra(instance));
    streamWriter.writeInt(getTipoCobro(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO)object);
  }
  
}
