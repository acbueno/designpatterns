package br.com.acbueno.designpatters.flyweight.musicplayer.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.flyweight.musicplayer.flyweigth.FlyWeigthFactory;
import br.com.acbueno.designpatters.flyweight.musicplayer.model.Music;

public class MusicService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MusicService.class);
  private Map<String, Map<String, Music>> memory;

  public MusicService() {
    memory = new HashMap<String, Map<String,Music>>();
  }

  public void listenMusic(String user, String desc) {
    Map<String, Music> userPlayerList = memory.get(user);

    if (userPlayerList == null) {
      userPlayerList = new HashMap<>();
      memory.put(user, userPlayerList);
    }

    Music song = userPlayerList.get(desc);

    if (song == null) {
      song = new Music(FlyWeigthFactory.getInstance().getMusic(desc));
      userPlayerList.put(desc, song);
    }

    String songName = song.getMusicFlyweigth().getName();
    LOGGER.info(String.format("%s escutando '%s", user, songName));
    song.listenning();
  }

  public void report() {
    Set<String> users = memory.keySet();

    for (String user : users) {
      int timeCounter = 0;
      LOGGER.info("----------");
      LOGGER.info(user + " está escutando....");
      Collection<Music> musics = memory.get(user).values();

      for (Music music : musics) {
        LOGGER.info(String.format("%s/%s/ %d times", music.getMusicFlyweigth().getArtist(), music.getMusicFlyweigth().getName(), music.getPlayerQty()));
        timeCounter += (music.getPlayerQty() * music.getMusicFlyweigth().getDurationInSeconds());
      }
      LOGGER.info(String.format("%s escutou música por %d segundos", user, timeCounter));
    }
    LOGGER.info("Total de musica em flyWeigth's memory " + FlyWeigthFactory.getInstance().getSize());
  }

}
