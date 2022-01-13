package br.com.acbueno.designpatters.chain.process.step;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class GetUserToken extends ProcessStep {

  public GetUserToken(Object... objects) {
    super(objects);
  }

  @Override
  public ProcessContext execute(ProcessContext context) throws Exception {
    String emailDb = (String) context.get("user.email");
    context.put("token", emailDb.toLowerCase());
    return next(context, emailDb.toLowerCase());
  }

}
