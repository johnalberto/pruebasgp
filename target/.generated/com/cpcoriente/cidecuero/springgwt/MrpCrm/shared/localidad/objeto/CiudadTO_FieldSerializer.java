package com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class CiudadTO_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO)object);
    }
  }
  private static native com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO getDpto(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::dpto;
  }-*/;
  
  private static native void  setDpto(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::dpto = value;
  }-*/;
  
  private static native java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::id;
  }-*/;
  
  private static native void  setId(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::id = value;
  }-*/;
  
  private static native java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::nombre;
  }-*/;
  
  private static native void  setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::nombre = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance) throws SerializationException {
    setDpto(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO instance) throws SerializationException {
    streamWriter.writeObject(getDpto(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    
  }
  
}
