package br.com.acbueno.designpatters.command.migration;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.command.migration.command.MigrationCommand;

public class MigrationTool {

  private static final Logger LOGGER = LoggerFactory.getLogger(MigrationTool.class);
  private List<MigrationCommand> migrations;
  private int nexMigratonIndex;

  public MigrationTool() {
    migrations = new ArrayList<MigrationCommand>();
    nexMigratonIndex = 0;
  }

  public void addMigration(MigrationCommand migration) {
    migrations.add(migration);
  }

  public void up() {
    if(migrations.size() > nexMigratonIndex) {
      migrations.get(nexMigratonIndex).execute();
      nexMigratonIndex++;
    } else {
      LOGGER.info("You are up to date!");
    }
  }

  public void down() {
    if(nexMigratonIndex > 0) {
      migrations.get(nexMigratonIndex -1).undo();
      nexMigratonIndex--;
    } else {
      LOGGER.info("You don't have migrations left");
    }
  }

  public void latest() {
    while (nexMigratonIndex !=0) {
      up();
    }
  }

 public void roolback() {
   while (nexMigratonIndex !=0) {
     down();
  }
 }

}
