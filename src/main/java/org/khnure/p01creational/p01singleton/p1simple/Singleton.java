package org.khnure.p01creational.p01singleton.p1simple;

// Імпортуємо пакет java.util для використання класу ArrayList (необов'язково, залежить від потреб)

public class Singleton {
    // Приватна статична змінна екземпляра класу
    private static Singleton instance;

    // Приватний конструктор, що запобігає створенню екземплярів через new
    private Singleton() {
        // Ініціалізація ресурсів або станів тут (необов'язково)
    }

    // Публічний статичний метод для отримання єдиного екземпляра класу
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Інші методи класу, які можуть бути потрібні
    public void doSomething() {
        System.out.println("Виконуємо дію з єдиним екземпляром.");
    }

    // Головний метод для тестування Singleton
    public static void main(String[] args) {
        // Отримання єдиного екземпляра класу
        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = new Singleton();

        // Виклик методу доSomething()
        singleton.doSomething();
    }
}

/*
1. Імпортуємо пакет `java.util` для використання класу `ArrayList` (необов'язково, залежить від потреб).
2. Оголошуємо публічний клас `Singleton`.
3. Приватна статична змінна екземпляра класу `instance`.
4. Приватний конструктор без параметрів, що запобігає створенню екземплярів через `new`.
5. Ініціалізація ресурсів або станів у приватному конструкторі (необов'язково).
6. Публічний статичний метод `getInstance` для отримання єдиного екземпляра класу.
7. Перевірка, чи існує вже створений екземпляр; якщо ні - створюємо новий.
8. Інші методи класу, які можуть бути потрібні (наприклад, `doSomething`).
9. Головний метод для тестування Singleton.
10. Отримання єдиного екземпляра класу за допомогою методу `getInstance`.
11. Виклик методу `doSomething` для виконання дії з єдиним екземпляром.
*/
