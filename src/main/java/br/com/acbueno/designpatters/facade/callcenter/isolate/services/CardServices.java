package br.com.acbueno.designpatters.facade.callcenter.isolate.services;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.isolate.model.Card;

public class CardServices {

  private static final Logger LOGGER = LoggerFactory.getLogger(CardServices.class);

  private Map<Long, Card> memory;


  public CardServices() {
   memory = new HashMap<>();
   memory.put(123456L, new Card(123456L, 11223344L));
  }

  public Card getCardByUser(Long id) {
    return memory.get(id);
  }

  public void removeCard(Card card) {
    memory.remove(card.getUserNumber());
  }

  public Card createNewCard(Long user, Long cardNumber) {
    Card newCard = new Card(cardNumber, cardNumber);
    memory.put(user, newCard);
    LOGGER.info("Criar o novo cartão: " + newCard);

    return newCard;
  }

}
