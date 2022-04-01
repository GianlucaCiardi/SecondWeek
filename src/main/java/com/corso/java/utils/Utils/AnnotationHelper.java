package com.corso.java.utils.Utils;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;




public class AnnotationHelper <A extends Annotation> {

    public static void getAnnotation() {
        for (Field f : AnnotationHelper.class.getDeclaredFields()) {
            com.corso.java.utils.Annotation.Logger logger = f.getAnnotation(com.corso.java.utils.Annotation.Logger.class);
            if (logger != null)
                Logger.getInstance().info(logger.item());
        }
    }
}
