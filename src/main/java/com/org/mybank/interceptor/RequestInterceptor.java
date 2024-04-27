package com.org.mybank.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.mybank.model.NewCustomerDetails;
import com.org.mybank.model.RequestHeaders;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class RequestInterceptor implements HandlerInterceptor {
    private final NewCustomerDetails newCustomerDetails;
    private final RequestHeaders requestHeaders;

    @Autowired
    public RequestInterceptor(NewCustomerDetails newCustomerDetails, RequestHeaders requestHeaders) {
        this.newCustomerDetails = newCustomerDetails;
        this.requestHeaders = requestHeaders;
    }

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        NewCustomerDetails newCustomerDetails = objectMapper.readValue(request.getReader(), NewCustomerDetails.class);
        requestHeaders.setHeader1(request.getHeader("Header1"));
        requestHeaders.setHeader2(request.getHeader("Header2"));
        requestHeaders.setHeader3(request.getHeader("Header3"));
        return true;
    }
}
