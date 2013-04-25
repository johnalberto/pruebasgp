package com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PaisTO_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO)object);
    }
  }
  private static native java.util.List getDptoList(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::dptoList;
  }-*/;
  
  private static native void  setDptoList(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance, java.util.List value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::dptoList = value;
  }-*/;
  
  private static native java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::id;
  }-*/;
  
  private static native void  setId(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::id = value;
  }-*/;
  
  private static native java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::nombre;
  }-*/;
  
  private static native void  setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::nombre = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance) throws SerializationException {
    setDptoList(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO instance) throws SerializationException {
    streamWriter.writeObject(getDptoList(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    
  }
  
}
