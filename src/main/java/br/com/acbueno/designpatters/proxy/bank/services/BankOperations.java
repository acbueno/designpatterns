package br.com.acbueno.designpatters.proxy.bank.services;

public interface BankOperations {

  void deposit(Long account, Double amount);
  void withdraw(Long account, String password, Double amount);
  void changePassword(Long account, String oldPassword, String newPassword);
}
