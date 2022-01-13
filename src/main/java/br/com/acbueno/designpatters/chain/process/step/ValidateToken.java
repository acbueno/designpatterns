package br.com.acbueno.designpatters.chain.process.step;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.repository.UserRepository;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class ValidateToken extends ProcessStep {

  public ValidateToken(Object...objects) {
    super(objects);
  }

  @Override
  public ProcessContext execute(ProcessContext context) throws Exception {
    String token = (String) context.get("token");
    String email = token.toLowerCase();
    Object user = UserRepository.getIstance().getUserByEmail(email);

    if(user == null) {
      throw new Exception("Invalid token!");
    }
    return next(context, true);
  }

}
