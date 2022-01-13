package br.com.acbueno.designpatters.flyweight.musicplayer.flyweigth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MusicFlyweigth {

  private final  String name;
  private final String artist;
  private final Integer durationInSeconds;

}
