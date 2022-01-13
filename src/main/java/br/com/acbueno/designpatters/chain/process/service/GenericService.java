package br.com.acbueno.designpatters.chain.process.service;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;

public class GenericService {

  public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
    try {
      ProcessContext result = startProcess.execute(initialContext);
      return result.getProcessResult();
    } catch (Exception e) {
      return "Error: " + e.getMessage();
    }
  }

}
