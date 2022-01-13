package br.com.acbueno.designpatters.flyweight.musicplayer.flyweigth;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyWeigthFactory {

  private static final Logger LOGGER = LoggerFactory.getLogger(FlyWeigthFactory.class);
  private static FlyWeigthFactory instance = new FlyWeigthFactory();
  private static Map<String, MusicFlyweigth> mapMusicFlyRepository;

  private FlyWeigthFactory() {
    mapMusicFlyRepository = new HashMap<String, MusicFlyweigth>();
  }

  public static FlyWeigthFactory getInstance() {
    return instance;
  }

  public MusicFlyweigth getMusic(String desc) {
    MusicFlyweigth musicFlyweigth = mapMusicFlyRepository.get(desc);

    if (musicFlyweigth == null) {
      LOGGER.info("Criando instancia Flyweigth for " + desc);
      musicFlyweigth = getMusicByString(desc);
      mapMusicFlyRepository.put(desc, musicFlyweigth);
    }
    return musicFlyweigth;
  }

  private MusicFlyweigth getMusicByString(String desc) {
    String[] musicaData = desc.split(";");

    return new MusicFlyweigth(musicaData[0], musicaData[1], new Integer(musicaData[2]));
  }

  public Integer getSize() {
    return mapMusicFlyRepository.size();
  }
}
