package br.com.acbueno.designpatters.facade.callcenter.isolate.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Register {

  private String storeName;
  private Double value;
  private Date date;

}
