package br.com.acbueno.designpatters.state.logistics;

public class Client {

  public static void main(String[] args) {

    DeliveryContext ctx = new DeliveryContext(null, "Package1");
    ctx.update();
    ctx.update();
    ctx.update();
    ctx.update();
    ctx.update();
  }

}
