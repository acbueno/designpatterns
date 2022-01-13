package br.com.acbueno.designpatters.command.alexa;

import br.com.acbueno.designpatters.command.commands.TurnLightOffCommand;
import br.com.acbueno.designpatters.command.commands.TurnLightOnCommand;
import br.com.acbueno.designpatters.command.lights.PhillipsHueLight;
import br.com.acbueno.designpatters.command.lights.XiamiLigth;

public class Client {

  public static void configureAlexa(Alexa alexa) {
    PhillipsHueLight livingRooom = new PhillipsHueLight();
    XiamiLigth kitchen = new XiamiLigth();

    alexa.addIntegraion("Turn on the Living room light", new TurnLightOnCommand(livingRooom), "on","Living room", "light" );
    alexa.addIntegraion("Turn off the Living room light", new TurnLightOffCommand(livingRooom), "off", "Living room", "light");
    alexa.addIntegraion("Turn on the Kitchen light", new TurnLightOnCommand(kitchen), "on", "Kitchen", "light");
    alexa.addIntegraion("Turn on the Kitchen light", new TurnLightOffCommand(kitchen), "off", "Kitchen", "light");
  }

  public static void main(String[] args) {
    Alexa alexa = new Alexa();
    configureAlexa(alexa);

    alexa.sendRequest("Turn on the Living room light");
    alexa.sendRequest("Turn off the Kitchen light");
    alexa.sendRequest("Please, could you Turn off the Living room light?");

  }

}
