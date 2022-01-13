package br.com.acbueno.designpatters.strategy.calc.stretegy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.strategy.context.Context;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
    LOGGER.info("10 + 5 = " + context.executeOperation(10, 5));

    context = new Context(new OperationSubstract());
    LOGGER.info("10 - 5 = " + context.executeOperation(10, 5));

    context = new Context(new OperationDivide());
    LOGGER.info("10 / 5 = " + context.executeOperation(10, 5));

    context = new Context(new OperationPlus());
    LOGGER.info("10 * 5 = " + context.executeOperation(10, 5));
  }

}
