package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RegimenImpuestoTO_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO_Array_Rank_1_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO_Array_Rank_1_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.RegimenImpuestoTO[])object);
  }
  
}