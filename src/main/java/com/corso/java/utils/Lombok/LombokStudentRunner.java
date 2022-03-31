package com.corso.java.utils.Lombok;

public class LombokStudentRunner {

    public static void main(String[] args) {
        LombokStudent lombokStudent =LombokStudent.builder()
                .name("G")
                .UserName("")
                .EMail("")
                .Password("")
                .age(25)
                .UserName("sfdh")
                .build();

    }
}
