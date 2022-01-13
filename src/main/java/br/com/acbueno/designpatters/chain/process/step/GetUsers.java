package br.com.acbueno.designpatters.chain.process.step;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.repository.UserRepository;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class GetUsers extends ProcessStep {

  @Override
  public ProcessContext execute(ProcessContext context) throws Exception {
    Object users = UserRepository.getIstance().getUser();
    context.put("users", users);
    return next(context, users);
  }

}
