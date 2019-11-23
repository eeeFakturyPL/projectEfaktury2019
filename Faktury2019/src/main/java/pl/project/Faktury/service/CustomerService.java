package pl.abc.faktury.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.abc.faktury.model.dto.CustomerDto;
import pl.abc.faktury.model.entity.Customer;
import pl.abc.faktury.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(CustomerDto customerDto){
        Customer customer = mapper.map(customerDto, Customer.class);
        customerRepository.save(customer);
    }

    public List<CustomerDto> getAllUser(){
        List<Customer> customers = customerRepository.findAll();
        for (Customer c : customers){
            System.out.println("Customer: "+c.getId()+" "+c.getNazwa()+" "+c.getNip());
        }
        return customers.stream().map(c->mapper.map(c,CustomerDto.class)).collect(Collectors.toList());
    }

}
