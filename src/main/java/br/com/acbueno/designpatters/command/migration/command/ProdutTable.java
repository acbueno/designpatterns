package br.com.acbueno.designpatters.command.migration.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ProdutTable extends MigrationCommand {

  public ProdutTable(Map<String, List<String>> database) {
    super(database);
  }

  @Override
  public void execute() {
    List<String> columns = new ArrayList<String>(Arrays.asList("Id", "Description", "Price"));
    database.put("Produtct", columns);
  }

  @Override
  public void undo() {
    database.remove("Product");
  }

}
