package br.com.acbueno.designpatters.strategy.context;

import br.com.acbueno.designpatters.strategy.calc.stretegy.Operation;

public class Context {

  private Operation operation;

  public Context(Operation operation) {
    this.operation = operation;
  }

  public int executeOperation(int num1, int num2) {
    return operation.doOperation(num1, num2);
  }

}
