package br.com.acbueno.designpatters.facade.callcenter.isolate.facade;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Register;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.CardServices;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.RegisterServices;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.ReportService;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.SecurityService;

public class CallCenterNewCardFacade {

  private static final Logger LOGGER = LoggerFactory.getLogger(CallCenterNewCardFacade.class);

  CardServices cardServices;
  RegisterServices registerServices;
  ReportService reportService;
  SecurityService securityService;

  public CallCenterNewCardFacade() {
    cardServices = new CardServices();
    registerServices = new RegisterServices();
    reportService = new ReportService(registerServices);
    securityService = new SecurityService(cardServices, registerServices);
  }

  public void cancelLastRegister(Long userId) {
    Card card = cardServices.getCardByUser(userId);
    List<Register> registers = registerServices.getRegistersByCard(card);
    registerServices.removeByIndex(card, registers.size() -1);
    List<Register> peddingRegisters = securityService.blockCard(card);
    Card newCard = cardServices.createNewCard(123456L, 33445566L);
    registerServices.addCardRegisters(newCard, peddingRegisters);
    reportService.getSummary(newCard);
  }

  public void orderNewCard(Long user) {
    Card card = cardServices.getCardByUser(user);
    List<Register> pendingRegisters = securityService.blockCard(card);
    Card newCard = cardServices.createNewCard(123456L, 99887766L);
    registerServices.addCardRegisters(newCard, pendingRegisters);
    reportService.getSummary(newCard);
  }

}
