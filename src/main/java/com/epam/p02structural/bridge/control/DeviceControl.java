package com.epam.p02structural.bridge.control;

import com.epam.p02structural.bridge.device.Device;

/**
 * У даному прикладі Bridge патерн дозволяє абстрагувати компоненти та їх імплементації,
 * дозволяючи обом еволюціонувати незалежно один від одного.
 */

// Абстракція
public abstract class DeviceControl {
    protected Device device;  // Посилання на імплементацію (міст)

    // Конструктор
    public DeviceControl(Device device) {
        this.device = device;
    }

    // Абстрактний метод переключення стану пристрою
    public abstract void togglePower();

    // Метод для виводу в консоль
    public void printStatus() {
        System.out.println("Пристрій " + (device.isEnabled() ? "увімкнено" : "вимкнено")); // Вивід статусу пристрою
    }
}
