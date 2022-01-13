package br.com.acbueno.designpatters.strategy.payment.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaypalStrategy implements PaymentStrategy {

  private static final Logger LOGGER = LoggerFactory.getLogger(PaypalStrategy.class);
  private String emailId;
  private String password;

  @Override
  public void pay(int amount) {
    LOGGER.info(amount + " paid using Paypal.");
  }

}
