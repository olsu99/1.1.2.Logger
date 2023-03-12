package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        log.log("Запускаем программу");
        Scanner scan = new Scanner(System.in);
        log.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int listSize = Integer.parseInt(scan.nextLine());
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(scan.nextLine());
        Random random = new Random();
        log.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + list.toString());

        log.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра");
        int filterValue = Integer.parseInt(scan.nextLine());
        Filter filter = new Filter(filterValue);
        list = filter.filterOut(list);
        System.out.println("Отфильтрованный список: " + list.toString());
        log.log("Завершаем программу");
    }
}