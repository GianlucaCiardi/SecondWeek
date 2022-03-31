package com.corso.java.utils.Utils;


import com.corso.java.utils.Annotation.Logger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;




public class AnnotationHelper <A extends Annotation> {

    public static void getAnnotation() {
        for (Field f : AnnotationHelper.class.getDeclaredFields()) {
            Logger logger = f.getAnnotation(Logger.class);
            if (logger != null)
                LOG.getInstance().info(logger.item());
        }
    }
}
