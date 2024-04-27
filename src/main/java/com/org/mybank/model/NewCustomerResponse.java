package com.org.mybank.model;

import org.springframework.stereotype.Component;

@Component
public record NewCustomerResponse (String firstName, String lastName, String fatherName,
                                   long accountNumber, String ifsiCode, String branch,
                                  String branchLocation, long branchCode, long branchPhoneNumber ){
}
