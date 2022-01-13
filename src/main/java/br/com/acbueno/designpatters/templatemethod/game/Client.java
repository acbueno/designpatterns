package br.com.acbueno.designpatters.templatemethod.game;

public class Client {

  public static void main(String[] args) {
    Game game = new Cricket();
    game.play();

    game = new Soccer();
    game.play();
  }

}
