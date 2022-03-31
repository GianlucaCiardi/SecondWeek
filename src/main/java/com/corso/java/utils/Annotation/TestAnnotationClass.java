package com.corso.java.utils.Annotation;

@SingleTestAnnotation(
        item="ciao" ,
        value=TestAnnotationEnum.SUCCESS)
public class TestAnnotationClass {

    public static void main(String[] args) {
        TestAnnotationClass testAnnotationClass = new TestAnnotationClass();
    }
}
