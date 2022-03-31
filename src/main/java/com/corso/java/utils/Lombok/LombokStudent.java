package com.corso.java.utils.Lombok;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class LombokStudent {

    private String name;
    private String LastName;
    private String UserName;
    private String Password;
    private String EMail;
    private int age;
    private boolean enable;

}
