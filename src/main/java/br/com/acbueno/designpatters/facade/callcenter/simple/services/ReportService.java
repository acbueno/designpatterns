package br.com.acbueno.designpatters.facade.callcenter.simple.services;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.facade.callcenter.simple.model.Card;
import br.com.acbueno.designpatters.facade.callcenter.simple.model.Register;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ReportService.class);
  private RegisterServices registerServices;

  public void getSummary(Card card) {
    List<Register> registers = registerServices.getRegisterByCard(card);
    registers.forEach(reg -> {
      LOGGER.info(String.format("%s\t%2f\t%s",
          reg.getStoreName(),
          reg.getValue(),
          reg.getDate().toString()));
    });

  }

}
