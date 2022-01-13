package br.com.acbueno.designpatters.bridge.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.bridge.converter.converters.Converter;
import br.com.acbueno.designpatters.bridge.converter.converters.CsvConverter;
import br.com.acbueno.designpatters.bridge.converter.converters.JsonConverter;
import br.com.acbueno.designpatters.bridge.converter.employees.InformationTecnology;
import br.com.acbueno.designpatters.bridge.converter.employees.ScrumMaster;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {

    Converter csvConverter = new CsvConverter();
    Converter jsonConverter = new JsonConverter();

    InformationTecnology informationTecnology = new InformationTecnology("Rambo", 50, 4000d);
    ScrumMaster scrumMaster = new ScrumMaster("Rei George", 80, 6000d);

    LOGGER.info(csvConverter.getEmployeeFormated(informationTecnology));
    LOGGER.info(jsonConverter.getEmployeeFormated(informationTecnology));
    LOGGER.info(csvConverter.getEmployeeFormated(scrumMaster));
    LOGGER.info(jsonConverter.getEmployeeFormated(scrumMaster));

  }

}
