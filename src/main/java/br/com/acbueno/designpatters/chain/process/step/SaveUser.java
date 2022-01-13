package br.com.acbueno.designpatters.chain.process.step;

import java.util.Map;
import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.repository.UserRepository;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;

public class SaveUser extends ProcessStep {

  public SaveUser(Object...objects) {
    super(objects);
  }

  @Override
  @SuppressWarnings("unchecked")
  public ProcessContext execute(ProcessContext context) throws Exception {
    Map<String, Object> userInput = (Map<String, Object>) context.get("input");
    UserRepository.getIstance().saveUser(userInput);
    return next(context, String.format("USer '%s' saved!", userInput.get("name")));
  }

}
