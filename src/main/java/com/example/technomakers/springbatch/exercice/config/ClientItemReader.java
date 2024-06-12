package com.example.technomakers.springbatch.exercice.config;

import com.example.technomakers.springbatch.exercice.model.Client;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;

public class ClientItemReader extends FlatFileItemReader<Client> {
    public ClientItemReader() {
        setResource(new ClassPathResource("clients.csv"));
        setLinesToSkip(1);
        setLineMapper(new DefaultLineMapper<Client>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("username", "lastname", "id");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Client>() {{
                setTargetType(Client.class);
            }});
        }});
    }
}
