package br.com.acbueno.designpatters.bridge.converter.converters;

import br.com.acbueno.designpatters.bridge.converter.employees.Employees;

public interface Converter {

  String getEmployeeFormated(Employees emp);

}
