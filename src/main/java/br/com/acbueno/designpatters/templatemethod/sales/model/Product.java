package br.com.acbueno.designpatters.templatemethod.sales.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

  private String desc;
  private Double value;
  private Category category;
  private Double weigth;

}
