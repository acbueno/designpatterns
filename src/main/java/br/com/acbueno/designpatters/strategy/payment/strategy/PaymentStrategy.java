package br.com.acbueno.designpatters.strategy.payment.strategy;

@FunctionalInterface
public interface PaymentStrategy {

  void pay(int amount);

}
