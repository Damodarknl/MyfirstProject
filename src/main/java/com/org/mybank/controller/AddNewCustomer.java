package com.org.mybank.controller;

import com.org.mybank.model.NewCustomerDetails;
import com.org.mybank.model.NewCustomerResponse;
import com.org.mybank.model.RequestHeaders;
import com.org.mybank.service.AddNewCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mybank")
public class AddNewCustomer {

    //@Autowired
    NewCustomerDetails newCustomerDetails;
    @Autowired
    RequestHeaders requestHeaders;
    @Autowired
    AddNewCustomerService addNewCustomerService;

    @PostMapping(value = "/addnewcustomer")
    public NewCustomerResponse addNewCustomer(){

       return addNewCustomerService.addNewCustomerDetails(requestHeaders.getHeader1(),requestHeaders.getHeader2(),
                requestHeaders.getHeader3(),newCustomerDetails);
    }
}
