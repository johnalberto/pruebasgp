package com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class DepartamentoTO_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO)object);
    }
  }
  private static native java.util.List getCiudadList(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::ciudadList;
  }-*/;
  
  private static native void  setCiudadList(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance, java.util.List value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::ciudadList = value;
  }-*/;
  
  private static native java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::id;
  }-*/;
  
  private static native void  setId(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::id = value;
  }-*/;
  
  private static native java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::nombre;
  }-*/;
  
  private static native void  setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::nombre = value;
  }-*/;
  
  private static native com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO getPais(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::pais;
  }-*/;
  
  private static native void  setPais(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::pais = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance) throws SerializationException {
    setCiudadList(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setPais(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO instance) throws SerializationException {
    streamWriter.writeObject(getCiudadList(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPais(instance));
    
  }
  
}
