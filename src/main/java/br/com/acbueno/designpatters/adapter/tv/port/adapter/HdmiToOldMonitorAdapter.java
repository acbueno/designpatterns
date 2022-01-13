package br.com.acbueno.designpatters.adapter.tv.port.adapter;

import javax.swing.ImageIcon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.adapter.tv.port.devices.OldMonitor;
import br.com.acbueno.designpatters.adapter.tv.port.interfaces.HDMI;

public class HdmiToOldMonitorAdapter extends OldMonitor implements HDMI {

  private static final Logger LOGGER = LoggerFactory.getLogger(HdmiToOldMonitorAdapter.class);

  public HdmiToOldMonitorAdapter() {
    super();
    LOGGER.info("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter...");
  }

  @Override
  public void setImage(String image) {
    LOGGER.info("Converting the image from HDMI to VGA");
    super.setImage(image);
  }

  @Override
  public void setSound(String sound) {
    LOGGER.info("Sorry, We don`t work with sound");
  }

}
