package br.com.acbueno.designpatters.chain.process.service;

import br.com.acbueno.designpatters.chain.process.repository.ProcessStep;
import br.com.acbueno.designpatters.chain.process.step.CheckPassword;
import br.com.acbueno.designpatters.chain.process.step.CreateMap;
import br.com.acbueno.designpatters.chain.process.step.GetUserByEmail;
import br.com.acbueno.designpatters.chain.process.step.GetUserToken;
import br.com.acbueno.designpatters.chain.process.step.GetUsers;
import br.com.acbueno.designpatters.chain.process.step.SaveUser;
import br.com.acbueno.designpatters.chain.process.step.ValidateMandatory;
import br.com.acbueno.designpatters.chain.process.step.ValidateToken;

public class ServicesCatalog {

  public static ProcessStep saveProcess = buildChain(
      new CreateMap("input"),
      new ValidateMandatory("input.name"),
      new ValidateMandatory("input.name"),
      new ValidateMandatory("input.password"),
      new SaveUser());

  public static ProcessStep loginProcess = buildChain(
      new CreateMap("input"),
      new ValidateMandatory("input.email"),
      new ValidateMandatory("input.password"),
      new GetUserByEmail(),
      new CheckPassword(),
      new GetUserToken());

  public static ProcessStep getUsersProcess = buildChain(
      new ValidateToken(),
      new GetUsers());

  private static ProcessStep buildChain(ProcessStep... processSteps) {
    for (int index = 0; index < processSteps.length - 1; index++) {
      ProcessStep curretProcess = processSteps[index];
      curretProcess.setNextStep(processSteps[index + 1]);
    }
    return processSteps[0];
  }

}
