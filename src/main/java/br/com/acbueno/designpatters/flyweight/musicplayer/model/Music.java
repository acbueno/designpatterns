package br.com.acbueno.designpatters.flyweight.musicplayer.model;

import br.com.acbueno.designpatters.flyweight.musicplayer.flyweigth.MusicFlyweigth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Music {

  private MusicFlyweigth musicFlyweigth;
  private Integer playerQty;

  public Music(MusicFlyweigth musicFlyweigth) {
    this.musicFlyweigth = musicFlyweigth;
    this.playerQty = 0;
  }

  public void listenning() {
    playerQty++;
  }

}
