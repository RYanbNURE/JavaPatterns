package com.epam.p02structural.bridge.device;

// Конкретна імплементація - Телевізор
public class Television implements Device {
    private boolean on = false;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Телевізор увімкнено."); // Сповіщення про увімкнення
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Телевізор вимкнено."); // Сповіщення про вимкнення
    }
}
