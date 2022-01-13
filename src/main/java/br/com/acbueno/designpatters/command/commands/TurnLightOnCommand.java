package br.com.acbueno.designpatters.command.commands;

import br.com.acbueno.designpatters.command.lights.GenericLight;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnLightOnCommand implements Command {

  private GenericLight light;

  @Override
  public void execute() {
    light.turnOn();
  }

}
