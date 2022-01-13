package br.com.acbueno.designpatters.facade.callcenter.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.simple.facade.CallCenterFacade;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Card;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    CallCenterFacade facade = new CallCenterFacade();

    Card card = facade.getCardByUser(123456L);
    LOGGER.info(card.toString());

    facade.getSummary(card);

    facade.getPaymentInfoByCard(card);

    facade.cancelLastRegister(card);

    Card newCard = facade.getCardByUser(123456L);
    LOGGER.info(newCard.toString());
  }

}
