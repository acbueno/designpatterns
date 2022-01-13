package br.com.acbueno.designpatters.strategy.payment.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {

  private static final Logger LOGGER = LoggerFactory.getLogger(CreditCardStrategy.class);
  private String name;
  private String cardNumber;
  private String cvv;
  private String dateOfExpiry;


  @Override
  public void pay(int amount) {
    LOGGER.info(amount + " paid with credit/debit card");
  }

}
