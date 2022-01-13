package br.com.acbueno.designpatters.chain.billdispenser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bill {

  private Integer value;
  private Bill next;
  private static final Logger LOGGER = LoggerFactory.getLogger(Bill.class);

  public Bill(Integer value) {
    this.value = value;
  }

  public Bill(Integer value, Bill next) {
    this.value = value;
    this.next = next;
  }

  public void setNext(Bill bill) {
    this.next = bill;
  }

  public void execute(Integer remaining) {
    if (remaining >= value) {
      int bills = remaining / value;
      remaining %= value;
      LOGGER.info(String.format("- %d bill(s) of $%d, $%d remaining", bills, value, remaining));
    }
    if (remaining == 0) {
      return;
    }
    if (next != null) {
      next.execute(remaining);
    }
  }

}
