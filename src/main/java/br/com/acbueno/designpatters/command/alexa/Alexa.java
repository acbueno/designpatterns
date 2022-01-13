package br.com.acbueno.designpatters.command.alexa;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.command.commands.Command;

public class Alexa {

  private static final Logger LOGGER = LoggerFactory.getLogger(Alexa.class);
  private Map<String, Command> integrations;
  private AlexaAI ai;


  public Alexa() {
    integrations = new HashMap<>();
    ai = new AlexaAI();
  }

  public void addIntegraion(String key, Command command, String... keywords) {
    integrations.put(key, command);
    ai.addAssociation(key, keywords);
  }

  public void sendRequest(String request) {
    Command command = integrations.get(request);
    if (command == null) {
      String key = ai.getFindAssociations(request);
      command = integrations.get(key);
      if (command == null) {
        LOGGER.info("Sorry, I can't perform your request!");
        return;
      }
    }
    LOGGER.info("Send a generic command as you saved in my configurations");
    command.execute();
  }

}
