package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FacturaImpuestoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO getFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "factura");
  }
  
  private static void setFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "factura", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO getIpc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "ipc");
  }
  
  private static void setIpc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "ipc", value);
  }
  
  private static java.lang.Float getPorcAplicado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "porcAplicado");
  }
  
  private static void setPorcAplicado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "porcAplicado", value);
  }
  
  private static java.lang.Float getValTotal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "valTotal");
  }
  
  private static void setValTotal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO.class, instance, "valTotal", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) throws SerializationException {
    setFactura(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setIpc(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO) streamReader.readObject());
    setPorcAplicado(instance, (java.lang.Float) streamReader.readObject());
    setValTotal(instance, (java.lang.Float) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO instance) throws SerializationException {
    streamWriter.writeObject(getFactura(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getIpc(instance));
    streamWriter.writeObject(getPorcAplicado(instance));
    streamWriter.writeObject(getValTotal(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaImpuestoTO)object);
  }
  
}
