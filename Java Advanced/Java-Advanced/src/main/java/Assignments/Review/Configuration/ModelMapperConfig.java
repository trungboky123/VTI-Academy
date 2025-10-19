package Assignments.Review.Configuration;

import Assignments.Review.DTO.Request.CreateAccountRequest;
import Assignments.Review.Entity.Account;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(CreateAccountRequest.class, Account.class).addMappings(mapper -> {
            mapper.skip(Account::setPassword);
            mapper.skip(Account::setCreateDate);
        });
        return modelMapper;
    }
}
