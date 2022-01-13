package br.com.acbueno.designpatters.facade.callcenter.simple.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Register;

public class RegisterServices {

  private static final Logger LOGGER = LoggerFactory.getLogger(RegisterServices.class);

  private Map<Long, List<Register>> memory;

  public RegisterServices() {
    memory = new HashMap<Long, List<Register>>();
    memory.put(11223344L, new ArrayList<>(Arrays.asList(new Register("Tintas SA", 120d, new Date()), new Register("Leroy Merlin", 1000d, new Date()), new Register("C&C", 2000d, new Date()))));
  }

  public List<Register> getRegisterByCard(Card card) {
    return memory.get(card.getCardNumber());
  }

  public void removeByIndex(Card card, int index) {
    List<Register> list = memory.get(card.getCardNumber());
    Register register = list.remove(index);
    LOGGER.info(register.toString() + " Deletado!");
    memory.put(card.getCardNumber(), list);
  }

  public void deleteCardRegisters(Card card) {
    memory.remove(card.getCardNumber());
  }

  public void addCardRegisters(Card card, List<Register> registers) {
    LOGGER.info("Adicionando registros para o novo cartão");
    memory.put(card.getCardNumber(), registers);
  }

}
