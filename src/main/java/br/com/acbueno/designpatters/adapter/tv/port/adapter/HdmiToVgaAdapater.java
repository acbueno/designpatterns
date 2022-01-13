package br.com.acbueno.designpatters.adapter.tv.port.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.adapter.tv.port.interfaces.HDMI;
import br.com.acbueno.designpatters.adapter.tv.port.interfaces.VGA;

public class HdmiToVgaAdapater implements HDMI {

  private static final Logger LOGGER = LoggerFactory.getLogger(HdmiToVgaAdapater.class);
  private VGA vga;

  public HdmiToVgaAdapater() {

  }

  @Override
  public void setImage(String image) {
    // TODO Auto-generated method stub

  }

  @Override
  public void setSound(String sound) {
    // TODO Auto-generated method stub

  }

}
