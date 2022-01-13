package br.com.acbueno.designpatters.facade.callcenter.simple.services;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Register;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayamentService {

  private static final Logger LOGGER = LoggerFactory.getLogger(PayamentService.class);

  private RegisterServices registerServices;

  public void getPaymentInfoByCard(Card card) {
    List<Register> registers = registerServices.getRegisterByCard(card);
    double sum = registers.stream().reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
    LOGGER.info(String.format("Você pagou %2f até próxima semana", sum));

  }

}
