package com.google.gwt.cell.client;

public class ImageCell_TemplateImpl implements com.google.gwt.cell.client.ImageCell.Template {
  public com.google.gwt.safehtml.shared.SafeHtml img(java.lang.String arg0) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<img src=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg0)))
        .append("\"></img>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
  
  }
