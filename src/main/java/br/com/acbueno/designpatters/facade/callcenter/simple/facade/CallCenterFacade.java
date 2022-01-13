package br.com.acbueno.designpatters.facade.callcenter.simple.facade;

import java.util.List;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Register;
import br.com.acbueno.designpatters.facade.callcenter.simple.services.CardServices;
import br.com.acbueno.designpatters.facade.callcenter.simple.services.PayamentService;
import br.com.acbueno.designpatters.facade.callcenter.simple.services.RegisterServices;
import br.com.acbueno.designpatters.facade.callcenter.simple.services.ReportService;
import br.com.acbueno.designpatters.facade.callcenter.simple.services.SecurityServices;

public class CallCenterFacade {

  CardServices cardServices;
  RegisterServices registerServices;
  ReportService reportService;
  PayamentService payamentService;
  SecurityServices securityServices;

  public CallCenterFacade() {
    cardServices = new CardServices();
    registerServices = new RegisterServices();
    reportService = new ReportService(registerServices);
    payamentService = new PayamentService(registerServices);
    securityServices = new  SecurityServices(cardServices, registerServices);
  }

  public Card getCardByUser(Long userId) {
    return cardServices.getCardByUser(userId);
  }

  public void getSummary(Card card) {
    reportService.getSummary(card);
  }

  public void getPaymentInfoByCard(Card card) {
    payamentService.getPaymentInfoByCard(card);
  }

  public void cancelLastRegister(Card card) {
    List<Register> registers = registerServices.getRegisterByCard(card);
    registerServices.removeByIndex(card, registers.size() - 1);
    List<Register> pendingRegisters = securityServices.blockCard(card);
    Card newCard = cardServices.createNewCard(123456L, 33445566L);
    registerServices.addCardRegisters(newCard, pendingRegisters);
    reportService.getSummary(newCard);
  }

}
