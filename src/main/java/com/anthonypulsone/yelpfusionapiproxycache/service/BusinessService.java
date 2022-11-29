package com.anthonypulsone.yelpfusionapiproxycache.service;

import com.anthonypulsone.yelpfusionapiproxycache.client.BusinessClient;
import com.anthonypulsone.yelpfusionapiproxycache.model.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class BusinessService {

    private final BusinessClient businessClient;


    @Autowired
    public BusinessService(BusinessClient businessClient) {
        this.businessClient = businessClient;
    }

    public Business getBusiness(String businessId) {

        ResponseEntity<Business> businessResponse = businessClient.getBusiness(businessId);
        return businessResponse.getBody();
    }

}
