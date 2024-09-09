package org.khnure.p03behavioural.p01templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        // Створення та виконання алгоритму з конкретної реалізації 1
        Algorithm algorithm1 = new ConcreteAlgorithm1();
        System.out.println("Запуск алгоритму ConcreteAlgorithm1:");
        algorithm1.execute();
        System.out.println("-----------------");
        // Створення та виконання алгоритму з конкретної реалізації 2
        Algorithm algorithm2 = new ConcreteAlgorithm2();
        System.out.println("Запуск алгоритму ConcreteAlgorithm2:");
        algorithm2.execute();
        System.out.println("-----------------");
        Algorithm algorithm3 = new ConcreteAlgorithm3();
        System.out.println("Запуск алгоритму ConcreteAlgorithm3:");
        algorithm3.execute();
    }
}
