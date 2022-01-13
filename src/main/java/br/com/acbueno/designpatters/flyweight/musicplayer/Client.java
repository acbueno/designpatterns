package br.com.acbueno.designpatters.flyweight.musicplayer;

import br.com.acbueno.designpatters.flyweight.musicplayer.service.MusicService;

public class Client {

  public static void main(String[] args) {
    MusicService player = new MusicService();
    player.listenMusic("User 1", "The Mirror;Dream Theater;600");
    player.listenMusic("User 1", "The Mirror;Dream Theater;600");
    player.listenMusic("User 1", "The Mirror;Dream Theater;600");
    player.listenMusic("User 1", "Nova era;Angra;800");
    player.listenMusic("User 2", "The Mirror;Dream Theater;600");
    player.listenMusic("User 2", "Nova era;Angra;800");

    player.report();
  }

}
