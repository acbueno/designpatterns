package br.com.acbueno.designpatters.facade.callcenter.isolate.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Register;

public class PaymentService {

  private static final Logger LOGGER = LoggerFactory.getLogger(PaymentService.class);

  private RegisterServices registerServices;

  public PaymentService(RegisterServices registerServices) {
    this.registerServices = registerServices;
  }


  public void getPaymentInfoByCard(Card card) {
    List<Register> registers = registerServices.getRegistersByCard(card);
    double sum = registers.stream()
        .reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
    LOGGER.info(String.format("Você tem para pagar %.2f até próxima semana", sum));

  }

}
