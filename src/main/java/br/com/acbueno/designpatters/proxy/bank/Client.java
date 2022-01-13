package br.com.acbueno.designpatters.proxy.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.proxy.bank.services.ATM;
import br.com.acbueno.designpatters.proxy.bank.services.Bank;
import br.com.acbueno.designpatters.proxy.bank.services.BankOperations;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    BankOperations bank = new Bank();
    bank.deposit(123L, 500D);
    bank.withdraw(456L, "8888", 50D);
    bank.withdraw(123L, "1234", 2000D);
    bank.changePassword(123L, "1111", "4321");
    bank.changePassword(123L, "1234", "4321");
    bank.withdraw(123L,"4321", 700D);

    LOGGER.info("------- ATM ----------");

    BankOperations atm = new ATM(bank);
    atm.deposit(123L, 500D);
    atm.withdraw(456L, "8888", 50D);
    atm.withdraw(456L, "9999", 50D);
    atm.withdraw(123L, "1234", 2000D);
    atm.changePassword(123L, "1111", "4321");
    atm.changePassword(123L, "1234", "4321");
    atm.withdraw(123L, "4321", 700D);


  }

}
