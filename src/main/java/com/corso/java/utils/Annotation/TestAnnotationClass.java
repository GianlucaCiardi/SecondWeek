package com.corso.java.utils.Annotation;


        import com.corso.java.utils.Utils.Logger;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: second-week
 * @date: 31-03-2022
 * @time: 09:56 min
 * @file: com.corso.java.db.annotation.TedstAnnotationClass
*/

        @TestAnnotation
        @SingleTestAnnotation(
        item = "Ciao")
        public class TestAnnotationClass {

        private String annotation;


        public static boolean isAnnotationPresents(){

        Class test = TestAnnotationClass.class;
        if(test.isAnnotationPresent(TestAnnotationClass.class)) Logger.getInstance().debug("There is annotation!!!!!");
        else Logger.getInstance().debug("There is not a annotation!!!!!");
        return false;
        }

        public static void main(String[] args) {}
        }