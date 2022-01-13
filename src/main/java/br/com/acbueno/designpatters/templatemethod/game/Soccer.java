package br.com.acbueno.designpatters.templatemethod.game;

import javax.xml.ws.handler.MessageContext.Scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Soccer extends Game {

  private static final Logger LOGGER = LoggerFactory.getLogger(Soccer.class);

  @Override
  void initialize() {
    LOGGER.info("Soccer Game Initialized! Start playing.");

  }

  @Override
  void startPlay() {
    LOGGER.info("Soccer Game Started. Enjoy the game!");

  }

  @Override
  void endPlay() {
    LOGGER.info("Soccer Game Finished!");
  }

}
