package org.example.HW13;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class UserGeneration {
    private static final Random random = new Random();

    public static String generateName() {
        String[] names = {"John", "Bob", "Emily", "Jack", "Melany", "Sali", "Stacy", "Josh", "Kate", "Haidi", "Nick"};
        return names[random.nextInt(names.length)];
    }

    public static int generateAge() {
        return random.nextInt(50) + 10;
    }

    public static String generateEmail() {
        String[] domains = {"gmail.com", "hotmail.com", "outlook.com"};
        String provider = generateRandomString(8); // Генеруємо випадковий рядок довжиною 8 символів
        String domain = domains[random.nextInt(domains.length)];
        return provider + "@" + domain;
    }

    // Метод для генерації випадкового рядка
    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    //Логіка на перевірку чи імʼя чоловіче, чи жіноче
    public static String determineGender(String name) {
        if (isMaleName(name)) {
            return "male";
        } else if (isFemaleName(name)) {
            return "female";
        } else {
            // Якщо ім'я не відоме, повертаємо null або значення за замовчуванням
            return null;
        }
    }

    private static boolean isMaleName(String name) {
        // Перевіряємо, чи ім'я відповідає чоловічим іменам
        String[] maleNames = {"Bob", "Josh", "John", "Jack", "Nick"};
        for (String maleName : maleNames) {
            if (name.equalsIgnoreCase(maleName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isFemaleName(String name) {
        // Перевіряємо, чи ім'я відповідає жіночим іменам
        String[] femaleNames = {"Emily", "Melany", "Sali", "Stacy", "Kate", "Haidi"};
        for (String femaleName : femaleNames) {
            if (name.equalsIgnoreCase(femaleName)) {
                return true;
            }
        }
        return false;
    }
}
