package br.com.acbueno.designpatters.composite.folders.model;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.decorator.Client;

public class File implements FileSystemItem {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  private String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void print(String structure) {
    LOGGER.info(structure + name);
  }

}
