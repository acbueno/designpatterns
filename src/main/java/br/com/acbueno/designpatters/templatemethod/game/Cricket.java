package br.com.acbueno.designpatters.templatemethod.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cricket extends Game {

  private static final Logger LOGGER = LoggerFactory.getLogger(Cricket.class);

  @Override
  void initialize() {
   LOGGER.info("Cricket Game Initialized! Start playing.");
  }

  @Override
  void startPlay() {
    LOGGER.info("Cricket Game Started. Enjoy the game!");

  }

  @Override
  void endPlay() {
   LOGGER.info("Cricket Game Finished!");
  }

}
