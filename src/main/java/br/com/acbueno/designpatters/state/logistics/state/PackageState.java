package br.com.acbueno.designpatters.state.logistics.state;

import br.com.acbueno.designpatters.state.logistics.DeliveryContext;

public interface PackageState {

  void updateState(DeliveryContext ctx);

}
