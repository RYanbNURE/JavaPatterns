package org.khnure.p02structural.bridge.demo;

import org.khnure.p02structural.bridge.control.DeviceControl;
import org.khnure.p02structural.bridge.control.RemoteControl;
import org.khnure.p02structural.bridge.device.Device;
import org.khnure.p02structural.bridge.device.Television;

// Основний клас для демонстрації патерну міст
public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new Television();
        DeviceControl remote = new RemoteControl(tv);

        remote.togglePower(); // Переключення стану телевізора
        remote.togglePower(); // Повторне переключення стану телевізора
    }
}
