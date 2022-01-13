package br.com.acbueno.designpatters.state.headphone;

import br.com.acbueno.designpatters.state.headphone.state.HeadPhone;

public class Client {

  public static void main(String[] args) {
    HeadPhone phone = new HeadPhone();
    phone.onClick();
    phone.onLongClick();
    phone.onClick();
    phone.onClick();
    phone.onClick();
    phone.onLongClick();
    phone.onClick();
  }

}
