package com.corso.java.utils.datetime;


import com.corso.java.utils.Utils.Logger;

import java.util.GregorianCalendar;


public class GregorianCalendarRunner {

    public static void main(String[] args) {
        Logger L =  Logger.getInstance();
        GregorianCalendar actualDate =new GregorianCalendar();
        int anno = actualDate.get(GregorianCalendar.YEAR);
        int mese = actualDate.get(GregorianCalendar.MONTH) + 1; //i mesi partono da 0 int giorno = dataAttuale.get(GregorianCalendar.DATE);
        int ore = actualDate.get(GregorianCalendar.HOUR);
        int minuti = actualDate.get(GregorianCalendar.MINUTE);
        int secondi = actualDate.get(GregorianCalendar.SECOND);

        L.info(String.valueOf(anno));
        L.info(String.valueOf(mese));
        L.info(String.valueOf(ore));
        L.info(String.valueOf(minuti));
        L.info(String.valueOf(secondi));

        GregorianCalendar data1 = new GregorianCalendar(2009, 11, 18);
        GregorianCalendar data2 = new GregorianCalendar(2009, 11, 18);
        if ( data1.before(data2) ) {
            L.info("data 1 precede data 2");
        } else if ( data1.after(data2) ) {
            L.info("data 2 precede data 1");
        } else {
            L.info("Le date sono uguali");
        }


    }
}