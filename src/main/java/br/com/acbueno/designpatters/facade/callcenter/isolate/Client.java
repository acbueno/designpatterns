package br.com.acbueno.designpatters.facade.callcenter.isolate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.isolate.facade.CallCenterFacade;
import br.com.acbueno.designpatters.facade.callcenter.isolate.facade.CallCenterNewCardFacade;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    CallCenterFacade facade = new CallCenterFacade();
    CallCenterNewCardFacade newCardFacade = new CallCenterNewCardFacade();
    Long userNumber =  123456L;

    Long cardNumber = facade.getCardByUser(userNumber);
    LOGGER.info(cardNumber.toString());

    facade.getSumary(cardNumber);
    facade.getPaymentInfoByCard(cardNumber);

    newCardFacade.cancelLastRegister(userNumber);
    Long newCardNumber = facade.getCardByUser(userNumber);
    LOGGER.info(newCardFacade.toString());
    newCardFacade.orderNewCard(userNumber);
    Long reNewCardNumber = facade.getCardByUser(userNumber);
    LOGGER.info(reNewCardNumber.toString());

  }

}
