package br.com.acbueno.designpatters.composite.folders.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.decorator.Client;

public class Folder implements FileSystemItem {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
  private String name;
  private List<FileSystemItem> childs;

  public Folder(String name, List<FileSystemItem> childs) {
    this.name = name;
    this.childs = childs;
  }

  @Override
  public void print(String structure) {
    LOGGER.info(structure + name);
    for (FileSystemItem child : childs) {
      child.print(structure + "| ");
    }
  }

}
