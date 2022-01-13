package br.com.acbueno.designpatters.command.order.commands;

import br.com.acbueno.designpatters.command.order.request.Stock;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SellStock implements Order {

  private Stock abcStock;

  @Override
  public void execute() {
    abcStock.sell();
  }

}
