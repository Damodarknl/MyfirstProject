package com.org.mybank.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class RequestHeaders {
    private String header1;
    private String header2;
    private String header3;

}
