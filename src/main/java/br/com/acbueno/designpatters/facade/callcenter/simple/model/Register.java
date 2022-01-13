package br.com.acbueno.designpatters.facade.callcenter.simple.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {

  private String storeName;
  private Double value;
  private Date date;

}
