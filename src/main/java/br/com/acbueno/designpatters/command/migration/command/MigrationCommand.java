package br.com.acbueno.designpatters.command.migration.command;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class MigrationCommand {

  protected Map<String, List<String>> database;

  public abstract void execute();

  public abstract void undo();

}
