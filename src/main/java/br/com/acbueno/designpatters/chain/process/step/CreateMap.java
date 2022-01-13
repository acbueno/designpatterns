package br.com.acbueno.designpatters.chain.process.step;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class CreateMap extends ProcessStep {

  public CreateMap(Object... objects) {
    super(objects);
  }

  @Override
  public ProcessContext execute(ProcessContext context) throws Exception {
    context.encapsule( (String) args[0]);
    return next(context, true);
  }

}
