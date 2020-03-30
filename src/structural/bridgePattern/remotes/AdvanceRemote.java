package structural.bridgePattern.remotes;

import structural.bridgePattern.devices.Device;

/**
 * @author Serj C.
 */
public class AdvanceRemote extends BasicRemote {
    public AdvanceRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
