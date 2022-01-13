package br.com.acbueno.designpatters.proxy.bank.services;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.proxy.bank.model.User;

public class Bank implements BankOperations {

  private static final Logger LOGGER = LoggerFactory.getLogger(Bank.class);
  private Map<Long, User> userDatabase;
  DecimalFormat df = new DecimalFormat("#,###.##");

  public Bank() {
    userDatabase = new HashMap<>();
    userDatabase.put(123L, new User("User 1", 123L, "1234", 1000D));
    userDatabase.put(123L, new User("User 2", 456L, "9999", 200D));
  }

  @Override
  public void deposit(Long account, Double amount) {
    User user = userDatabase.get(account);

    if (user == null) {
      LOGGER.info("Invalid account");
      return;
    }
    user.setBalance(user.getBalance() + amount);
    LOGGER.info(String.format("%s + %s. Novo Saldo: %s", user.getName(), df.format(amount), df.format(user.getBalance())));
  }

  @Override
  public void withdraw(Long account, String password, Double amount) {
    User user = userDatabase.get(account);

    if (user == null) {
      LOGGER.info("Conta invalida");

      return;
    }

    if (!user.getPassword().equals(password)) {
      LOGGER.info("Senha errada!");
      return;
    }

    if (user.getBalance() < amount) {
      LOGGER.info("Você não tem saldo suficiente");

      return;
    }
    user.setBalance(user.getBalance() - amount);
    LOGGER.info(String.format("%s -%d. Novo saldo: %d", user.getName(), amount, user.getBalance()));
  }

  @Override
  public void changePassword(Long account, String oldPassword, String newPassword) {
    User user = userDatabase.get(account);

    if (user == null) {
      LOGGER.info("Conta invalida");

      return;
    }

    if (!user.getPassword().equals(oldPassword)) {
      LOGGER.info("Senha errada");

      return;
    }

    user.setPassword(newPassword);
    LOGGER.info(String.format("%s' senha atualizada com sucesso", user.getName()));

  }

}
