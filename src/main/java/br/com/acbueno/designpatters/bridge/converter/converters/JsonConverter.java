package br.com.acbueno.designpatters.bridge.converter.converters;

import br.com.acbueno.designpatters.bridge.converter.employees.Employees;

public class JsonConverter implements Converter {

  @Override
  public String getEmployeeFormated(Employees emp) {
    StringBuilder builder = new StringBuilder();

    builder.append("{\n")
    .append("\t\"name\": \"")
    .append(emp.getName())
    .append("\",\n")
    .append("\t\"age\": \"")
    .append(emp.getAge())
    .append("\", \n")
    .append("\t\"salary\": \"")
    .append(emp.getSalary())
    .append("\"\n")
    .append("}");

    return builder.toString();
  }

}
