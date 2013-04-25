package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class VerticalSplitPanel_Resources_default_InlineClientBundleGenerator implements com.google.gwt.user.client.ui.VerticalSplitPanel.Resources {
  private static VerticalSplitPanel_Resources_default_InlineClientBundleGenerator _instance0 = new VerticalSplitPanel_Resources_default_InlineClientBundleGenerator();
  private void verticalSplitPanelThumbInitializer() {
    verticalSplitPanelThumb = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "verticalSplitPanelThumb",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 7, 7, false, false
    );
  }
  private static class verticalSplitPanelThumbInitializer {
    static {
      _instance0.verticalSplitPanelThumbInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return verticalSplitPanelThumb;
    }
  }
  public com.google.gwt.resources.client.ImageResource verticalSplitPanelThumb() {
    return verticalSplitPanelThumbInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAcAAAAHCAYAAADEUlfTAAAArklEQVR42mNgAAI/Pz/xsLCweUC8KygoqJ4BBnx8fKRjYmJeBAQEPAwODr4THR39DIgPgSVBOoCCD+Pi4s5UVVWdaW5uPpOdnf02Pj7emyEiImJXYmLinUmTJp3ZsmXLmV27dp1pamp6UVxcXMgQFRXVnJ+f/xQkcerUqTMnTpw4W1tb+66trU0LbHRBQcH+urq6dz09PS9B9MSJExGOAgGgSnug0ekzZszQgokBAExeULnCXQAFAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource verticalSplitPanelThumb;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      verticalSplitPanelThumb(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("verticalSplitPanelThumb", verticalSplitPanelThumb());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'verticalSplitPanelThumb': return this.@com.google.gwt.user.client.ui.VerticalSplitPanel.Resources::verticalSplitPanelThumb()();
    }
    return null;
  }-*/;
}
