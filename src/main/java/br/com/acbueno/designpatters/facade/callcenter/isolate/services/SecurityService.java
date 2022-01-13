package br.com.acbueno.designpatters.facade.callcenter.isolate.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Register;

public class SecurityService {

  private static final Logger LOGGER = LoggerFactory.getLogger(SecurityService.class);
  private CardServices cardServices;
  private RegisterServices registerServices;

  public SecurityService(CardServices cardServices, RegisterServices registerServices) {
    this.cardServices = cardServices;
    this.registerServices = registerServices;
  }

 public List<Register> blockCard(Card card){
   LOGGER.info("Cartão bloqueado: " + card);
   List<Register> peddingRegisters = registerServices.getRegistersByCard(card);
   cardServices.removeCard(card);
   registerServices.deleteCardRegisters(card);

   return peddingRegisters;
 }



}
