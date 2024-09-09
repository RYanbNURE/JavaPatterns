package org.khnure.p02structural.bridge.control;

import org.khnure.p02structural.bridge.device.Device;

// Розширення абстракції
public class RemoteControl extends DeviceControl {
    public RemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
        System.out.println("Пульт переключив стану: "); // Вивід дії
        printStatus();
    }
}
