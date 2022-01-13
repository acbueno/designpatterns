package br.com.acbueno.designpatters.facade.callcenter.simple.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {

  private Long userNumber;

  private Long cardNumber;

}
