package com.corso.java.utils.datetime;


import com.corso.java.utils.Utils.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeRunner {


    public static void main(String[] args) throws ParseException {
        Logger L = Logger.getInstance();
        Date date = new Date();
        L.info(date.toString());

        DateFormat format = DateFormat.getDateInstance();
        L.info(format.format(date));

        DateFormat format2 = DateFormat.getDateInstance(DateFormat.FULL);
        L.info(format2.format(date));

        DateFormat format3 = DateFormat.getDateInstance(DateFormat.LONG);
        L.info(format3.format(date));

        DateFormat format4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        L.info(format4.format(date));

        DateFormat format5 = DateFormat.getDateInstance(DateFormat.SHORT);
        L.info(format5.format(date));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        L.info(simpleDateFormat.format(date));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss");
        L.info(simpleDateFormat2.format(date));

        String birthday = "25/09/1977";
        SimpleDateFormat birthdayFormatter = new SimpleDateFormat("dd/MM/yyyy");
        Date birthdayDay = birthdayFormatter.parse(birthday);
        L.info(birthdayFormatter.format(birthdayDay));

        L.info(String.valueOf(date.compareTo(birthdayDay)));

    }
}
