package br.com.acbueno.designpatters.state.logistics;

import br.com.acbueno.designpatters.state.logistics.state.Acknowledged;
import br.com.acbueno.designpatters.state.logistics.state.PackageState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryContext {

  private PackageState currentState;
  private String packageId;

  public DeliveryContext(PackageState currentState, String packageId) {
    super();
    this.currentState = currentState;
    this.packageId = packageId;

    if(currentState == null) {
      this.currentState = Acknowledged.geInstance();
    }
  }

  public void update() {
    currentState.updateState(this);
  }



}
