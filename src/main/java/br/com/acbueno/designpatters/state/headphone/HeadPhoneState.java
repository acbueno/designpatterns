package br.com.acbueno.designpatters.state.headphone;

import br.com.acbueno.designpatters.state.headphone.state.HeadPhone;

public interface HeadPhoneState {

  void click(HeadPhone headPhone);

  void longClick(HeadPhone headPhone);
}
