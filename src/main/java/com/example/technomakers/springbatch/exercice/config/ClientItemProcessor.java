package com.example.technomakers.springbatch.exercice.config;

import com.example.technomakers.springbatch.exercice.model.Client;
import com.example.technomakers.springbatch.exercice.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class ClientItemProcessor implements ItemProcessor<Client, Client> {
    @Override
    public Client process(Client client) throws Exception {
        if (client.getId() > 30) {
            client.setUsername(client.getUsername() + "ok");
        }
        System.out.println(client);
        return client;
    }
}