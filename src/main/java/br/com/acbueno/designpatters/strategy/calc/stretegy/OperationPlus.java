package br.com.acbueno.designpatters.strategy.calc.stretegy;

public class OperationPlus implements Operation {

  @Override
  public int doOperation(int num1, int num2) {
    return num1 * num2;
  }

}
