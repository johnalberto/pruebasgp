package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RegimenImpuestoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum getCompra(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "compra");
  }
  
  private static void setCompra(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "compra", value);
  }
  
  private static java.lang.Integer getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO getImpuesto(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "impuesto");
  }
  
  private static void setImpuesto(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "impuesto", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum getVende(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "vende");
  }
  
  private static void setVende(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO.class, instance, "vende", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance) throws SerializationException {
    setCompra(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum) streamReader.readObject());
    setId(instance, (java.lang.Integer) streamReader.readObject());
    setImpuesto(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO) streamReader.readObject());
    setVende(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO instance) throws SerializationException {
    streamWriter.writeObject(getCompra(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getImpuesto(instance));
    streamWriter.writeObject(getVende(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO)object);
  }
  
}
