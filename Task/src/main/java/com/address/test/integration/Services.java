package com.address.test.integration;

import com.address.test.model.Model;
import org.springframework.stereotype.Service;

@Service("Services")
public class Services {
    
    public Model getModel(){
    	
        Model  rModel = new Model();
        
        rModel.setHouse("#3321");
        rModel.setStreet("Washington Ave");
        rModel.setPostalCode("784567");
        rModel.setCity("Brooklyn");
        rModel.setCountry("US");
        rModel.setState("NY");
        rModel.setCountryCode("1");

        return rModel;

    }
}
