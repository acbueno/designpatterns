package br.com.acbueno.designpatters.bridge.converter.converters;

import java.util.Locale;

import br.com.acbueno.designpatters.bridge.converter.employees.Employees;

public class CsvConverter implements Converter {

  @Override
  public String getEmployeeFormated(Employees emp) {
    return String.format(Locale.US, "%s,%d,%2f",
        emp.getName(),
        emp.getAge(),
        emp.getSalary());
  }

}
