package com.address.test.controler;

//import com.address.test.integration.Services;

import com.address.test.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

@RequestMapping(path = "/")

public class Controller {
	
    @Autowired
    com.address.test.integration.Services Services;


    @RequestMapping(value = "randomizer/address" , method = RequestMethod.GET)
    
    public ResponseEntity<Model> getModel(){
        Model result  = Services.getModel();
        
        return ResponseEntity.ok(result);
    }
}
