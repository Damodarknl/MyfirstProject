package com.org.mybank.model;

import org.springframework.stereotype.Component;

public record NewCustomerDetails(String firstName, String lastName, String fatherName, int age, long aadharNumber,String address, String city,
                                 long phoneNumber, long pinCode) {
}
