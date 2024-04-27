package com.org.mybank.service;

import com.org.mybank.model.Constants;
import com.org.mybank.model.NewCustomerDetails;
import com.org.mybank.model.NewCustomerResponse;
import org.springframework.stereotype.Service;

@Service
public class AddNewCustomerService {
    public NewCustomerResponse addNewCustomerDetails(String header1, String header2, String header3, NewCustomerDetails newCustomerDetails) {
        NewCustomerResponse newCustomerResponse = new NewCustomerResponse(newCustomerDetails.firstName(),
                                                  newCustomerDetails.lastName(), newCustomerDetails.fatherName(),
               123456789L ,Constants.IFSI_CODE,Constants.BRANCH, Constants.BRANCH_LOCATION, Constants.BRANCH_CODE, 9908591437l);
        return newCustomerResponse;

    }
}
