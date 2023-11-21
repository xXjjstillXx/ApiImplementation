package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClientModel;
import com.example.demo.repository.ClientRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService {
    @Autowired
    ClientRepository elemClientRepository;

    //crud: create, read o findAll, update, delete

    public ClientModel create(ClientModel newCliente) {
        return this.elemClientRepository.save(newCliente);
    }

    public List<ClientModel> findAll(){
        return this.elemClientRepository.findAll();
    }

    public ClientModel update(ClientModel client, Long id){
        Optional<ClientModel> clientDB =this.elemClientRepository.findById(id);
        ClientModel c = null;
        if(clientDB.isPresent()){
            c = clientDB.get();
            c.setName(client.getName());
            c.setLastName(client.getLastName());
            c.setDocNumber(client.getDocNumber());
            c = this.elemClientRepository.save(c);
        }
        return c;
        
    }

    public void delete(Long id){
        this.elemClientRepository.deleteById(id);
    }

}
