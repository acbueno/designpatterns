package br.com.acbueno.designpatters.chain.process.step;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class ValidateMandatory extends ProcessStep {

  public ValidateMandatory(Object...objects) {
    super(objects);
  }

  @Override
  public ProcessContext execute(ProcessContext context) throws Exception {
    Object field = context.get((String) args[0]);

    if(field == null ) {
      throw new Exception(String.format("%s is empty", args[0]));
    }
    return next(context, true);
  }

}
