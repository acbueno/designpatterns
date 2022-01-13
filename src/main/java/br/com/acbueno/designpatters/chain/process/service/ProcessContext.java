package br.com.acbueno.designpatters.chain.process.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProcessContext {

  private Map<String, Object> context;
  private Object processResult;

  public ProcessContext() {
    context = new LinkedHashMap<>();
  }

  @SuppressWarnings("unchecked")
  public Object get(String key) throws Exception {
    if (!key.contains(".")) {
      return context.get(key);
    }
    String[] steps = key.split("\\.");
    Object currentMap = context;

    for (String step : steps) {
      if (currentMap instanceof Map) {
        currentMap = ((Map<String, Object>) currentMap).get(step);
      } else {
        throw new Exception(String.format("Could not navigete through %s step", steps));
      }
    }
    return currentMap;
  }

  public Object put(String key, Object value) {
    return context.put(key, value);
  }

  public Object remove(String key) {
    return context.remove(key);
  }

  public void reset() {
    context = new LinkedHashMap<>();
    processResult = null;
  }

  public void encapsule(String key) {
    Map<String, Object> newContext = new LinkedHashMap<>();
    newContext.put(key, context);
    context = newContext;
  }

  public void addProcessResult(Object result) {
    this.processResult = result;
  }

  public Object getProcessResult() {
    return processResult;
  }

}
