package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        logger.log("Запускаем фильтрацию");
        for (Integer integer : source) {
            if (integer > treshold) {
                result.add(integer);
                count++;
                logger.log("Элемент " + integer + " проходит");
            } else {
                logger.log("Элемент " + integer + " не проходит");
            }
        }
        logger.log("Прошло " + count + " элементов из " + source.size());
        return result;
    }
}
