package br.com.acbueno.designpatters.facade.callcenter.isolate.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Register;

public class RegisterServices {

  private static final Logger LOGGER = LoggerFactory.getLogger(RegisterServices.class);
  private Map<Long, List<Register>> memory;

  public RegisterServices() {
    memory = new HashMap<Long, List<Register>>();
    memory.put(11223344L, new ArrayList<>(Arrays.asList(
        new Register("Torneira", 30d, new Date()),
        new Register("Tijolo", 18d, new Date()),
        new Register("Caneleta", 20d, new Date())
        )));
  }

  public List<Register> getRegistersByCard(Card card){
    return memory.get(card.getCardNumber());
  }

  public void removeByIndex(Card card, int i) {
    List<Register> list = memory.get(card.getCardNumber());
    Register register = list.remove(i);
    LOGGER.info(register.toString() + " Deleteado");
    memory.put(card.getCardNumber(), list);
  }

  public void deleteCardRegisters(Card card) {
    memory.remove(card.getCardNumber());
  }

  public void addCardRegisters(Card card, List<Register> registers) {
    LOGGER.info("Associando registro de novo cartão");
    memory.put(card.getCardNumber(), registers);
  }

}
