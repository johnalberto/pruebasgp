<<<<<<< .mine
package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class LineaTO_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO)object);
    }
  }
  private static native java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::descripcion;
  }-*/;
  
  private static native void  setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::descripcion = value;
  }-*/;
  
  private static native java.util.List getHijosList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::hijosList;
  }-*/;
  
  private static native void  setHijosList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.util.List value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::hijosList = value;
  }-*/;
  
  private static native java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::id;
  }-*/;
  
  private static native void  setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::id = value;
  }-*/;
  
  private static native java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::nombre;
  }-*/;
  
  private static native void  setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::nombre = value;
  }-*/;
  
  private static native com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO getPadre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::padre;
  }-*/;
  
  private static native void  setPadre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::padre = value;
  }-*/;
  
  private static native java.util.List getTerceroList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::terceroList;
  }-*/;
  
  private static native void  setTerceroList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.util.List value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::terceroList = value;
  }-*/;
  
  private static native short getTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::tipo;
  }-*/;
  
  private static native void  setTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, short value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::tipo = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setHijosList(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setPadre(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO) streamReader.readObject());
    setTerceroList(instance, (java.util.List) streamReader.readObject());
    setTipo(instance, streamReader.readShort());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getHijosList(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPadre(instance));
    streamWriter.writeObject(getTerceroList(instance));
    streamWriter.writeShort(getTipo(instance));
    
  }
  
}
=======
package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class LineaTO_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO)object);
    }
  }
  private static native java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::descripcion;
  }-*/;
  
  private static native void  setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::descripcion = value;
  }-*/;
  
  private static native java.util.List getHijosList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::hijosList;
  }-*/;
  
  private static native void  setHijosList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.util.List value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::hijosList = value;
  }-*/;
  
  private static native java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::id;
  }-*/;
  
  private static native void  setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::id = value;
  }-*/;
  
  private static native java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::nombre;
  }-*/;
  
  private static native void  setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.lang.String value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::nombre = value;
  }-*/;
  
  private static native com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO getPadre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::padre;
  }-*/;
  
  private static native void  setPadre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::padre = value;
  }-*/;
  
  private static native java.util.List getTerceroList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) /*-{
    return instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::terceroList;
  }-*/;
  
  private static native void  setTerceroList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance, java.util.List value) /*-{
    instance.@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::terceroList = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setHijosList(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setPadre(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO) streamReader.readObject());
    setTerceroList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getHijosList(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPadre(instance));
    streamWriter.writeObject(getTerceroList(instance));
    
  }
  
}
>>>>>>> .r77
