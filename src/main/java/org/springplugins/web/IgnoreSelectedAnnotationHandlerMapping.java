package org.springplugins.web;

import java.util.ArrayList;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;

public class IgnoreSelectedAnnotationHandlerMapping extends DefaultAnnotationHandlerMapping {
  private ArrayList a;
  
  public void setUrls(ArrayList paramArrayList) {
    this.a = paramArrayList;
  }
  
  public String[] getFiltered(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return null; 
    ArrayList<String> arrayList = new ArrayList();
    for (String str : paramArrayOfString) {
      if (!this.a.contains(str))
        arrayList.add(str); 
    } 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  protected String[] determineUrlsForHandler(String paramString) {
    return getFiltered(super.determineUrlsForHandler(paramString));
  }
}


/* Location:              C:\Users\MiguelAngel\Downloads\web-1.0.0.jar!\org\springplugins\web\IgnoreSelectedAnnotationHandlerMapping.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */