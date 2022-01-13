package br.com.acbueno.designpatters.command.migration;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.command.migration.command.ProdutTable;
import br.com.acbueno.designpatters.command.migration.command.UserTable;
import br.com.acbueno.designpatters.command.migration.command.UserTableRoleColumn;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    Map<String, List<String>> database = new LinkedHashMap<>();
    MigrationTool tool = new MigrationTool();
    tool.addMigration(new UserTable(database));
    tool.addMigration(new ProdutTable(database));
    tool.addMigration(new UserTableRoleColumn(database));

    LOGGER.info(database.toString());

    tool.up();
    LOGGER.info(database.toString());

    tool.up();
    LOGGER.info(database.toString());

    tool.up();
    LOGGER.info(database.toString());

    tool.up();
    LOGGER.info(database.toString());

    tool.down();
    LOGGER.info(database.toString());

    tool.down();
    LOGGER.info(database.toString());

    tool.down();
    LOGGER.info(database.toString());

    tool.down();
    LOGGER.info(database.toString());

    tool.latest();
    LOGGER.info(database.toString());

    tool.roolback();
    LOGGER.info(database.toString());

  }

}
