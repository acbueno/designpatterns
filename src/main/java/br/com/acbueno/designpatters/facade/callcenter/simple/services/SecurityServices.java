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
public class SecurityServices {

  private final static Logger LOGGER = LoggerFactory.getLogger(SecurityServices.class);

  private CardServices cardServices;
  private RegisterServices registerServices;

  public List<Register> blockCard(Card card) {
    LOGGER.info("Cartão bloqueado:" + card);
    List<Register> pendingRegisters = registerServices.getRegisterByCard(card);
    cardServices.removeCard(card);
    registerServices.deleteCardRegisters(card);

    return pendingRegisters;
  }

}
