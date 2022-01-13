package br.com.acbueno.designpatters.facade.callcenter.isolate.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Register;

public class ReportService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ReportService.class);
  private RegisterServices registerServices;

  public ReportService(RegisterServices registerServices) {
    this.registerServices = registerServices;
  }

  public void getSummary(Card card) {
    List<Register> registers = registerServices.getRegistersByCard(card);
    registers.forEach(reg -> {
       LOGGER.info(String.format("%s\t%.2f\t%s",
           reg.getStoreName(),
           reg.getValue(),
           reg.getDate().toString()));
    });
  }

}
