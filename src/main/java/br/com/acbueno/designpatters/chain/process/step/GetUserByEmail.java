package br.com.acbueno.designpatters.chain.process.step;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.repository.UserRepository;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class GetUserByEmail extends ProcessStep {

  public GetUserByEmail(Object... objects) {
    super(objects);
  }

  @Override
  public ProcessContext execute(ProcessContext context) throws Exception {
    String email = (String) context.get("input.email");
    Object user = UserRepository.getIstance().getUserByEmail(email);
    context.put("user", user);
    return next(context, user);
  }

}
