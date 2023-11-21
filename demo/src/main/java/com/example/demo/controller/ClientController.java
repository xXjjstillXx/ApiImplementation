package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClientModel;
import com.example.demo.service.ClientService;


@RequestMapping(path = "api/v1/client") //para exponer el url
@RestController //para exponer una api rest
public class ClientController {

    @Autowired
     private ClientService clientService;

     //create, findAll(read), update, delete
     @PostMapping("/") //http://localhost:9500/api/v1/clients/
     public ResponseEntity<ClientModel> create(@RequestBody ClientModel client) {
        return new ResponseEntity<>(this.clientService.create(client), HttpStatus.OK);
        //puruteva
     }
}
