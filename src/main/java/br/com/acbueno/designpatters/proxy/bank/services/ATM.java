package br.com.acbueno.designpatters.proxy.bank.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATM implements BankOperations {

  private static final Logger LOGGER = LoggerFactory.getLogger(ATM.class);
  private BankOperations bank;

  public ATM(BankOperations bank) {
    this.bank = bank;
  }

  @Override
  public void deposit(Long account, Double amount) {
    LOGGER.info("ATM proxy enviando requisição para o banco");
    bank.deposit(account, amount);
  }

  @Override
  public void withdraw(Long account, String password, Double amount) {
    if (amount > 300) {
      LOGGER.info("Você não pode sacar mais que 300 no caixa eletronico");

      return;
    }
    LOGGER.info("ATM proxy enviando requisição para o banco");
    bank.withdraw(account, password, amount);
  }

  @Override
  public void changePassword(Long account, String oldPassword, String newPassword) {
    LOGGER.info("Esta operação não pode ser efetuado no caixa eletronico. \n procura uma agencia bancaria");

    return;
  }

}
