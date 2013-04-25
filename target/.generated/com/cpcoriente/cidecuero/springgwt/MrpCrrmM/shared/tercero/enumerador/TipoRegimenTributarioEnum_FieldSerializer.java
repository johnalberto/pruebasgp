package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoRegimenTributarioEnum_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getNameToken(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum.class, instance, "nameToken");
  }
  
  private static void setNameToken(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum.class, instance, "nameToken", value);
  }
  
  private static int getValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum.class, instance, "valor");
  }
  
  private static void setValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instance, int value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum.class, instance, "valor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum[] values = com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum)object);
  }
  
}