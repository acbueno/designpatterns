package br.com.acbueno.designpatters.command.commands;

import br.com.acbueno.designpatters.command.lights.GenericLight;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnLightOffCommand implements Command {

  private GenericLight light;

  @Override
  public void execute() {
    light.turnOff();
  }

}
