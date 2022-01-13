package br.com.acbueno.designpatters.facade.callcenter.isolate.facade;

import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.CardServices;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.PaymentService;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.RegisterServices;
import br.com.acbueno.designpatters.facade.callcenter.isolate.services.ReportService;

public class CallCenterFacade {

  CardServices cardServices;
  RegisterServices registerServices;
  ReportService reportService;
  PaymentService paymentService;

  public CallCenterFacade() {
    cardServices = new CardServices();
    registerServices = new RegisterServices();
    reportService = new ReportService(registerServices);
    paymentService = new PaymentService(registerServices);
  }

  public Long getCardByUser(Long id) {
    Card card = cardServices.getCardByUser(id);
    return card.getCardNumber();
  }

  public void getSumary(Long cardNumber) {
    reportService.getSummary(new Card(null, cardNumber));
  }

  public void getPaymentInfoByCard(Long cardNumber) {
    paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
  }

}
