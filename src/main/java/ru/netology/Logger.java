package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy HH.mm.ss");

    public void log(String msg) {
        System.out.println("[" + sdf.format(new Date()) + " " + num + "] " + msg);
        num++;
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
