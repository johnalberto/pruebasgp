package com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoUsuarioEnum_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getNameToken(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum.class, instance, "nameToken");
  }
  
  private static void setNameToken(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum.class, instance, "nameToken", value);
  }
  
  private static int getValor(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum.class, instance, "valor");
  }
  
  private static void setValor(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instance, int value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum.class, instance, "valor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum[] values = com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum)object);
  }
  
}
