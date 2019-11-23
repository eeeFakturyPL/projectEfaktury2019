package pl.abc.faktury.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.abc.faktury.model.dto.UserDto;
import pl.abc.faktury.model.entity.Customer;
import pl.abc.faktury.model.entity.User;
import pl.abc.faktury.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDto userDto){
        User user = mapper.map(userDto, User.class);
        userRepository.save(user);
    }

    public List<UserDto> getAllUser(){
        List<User> users = userRepository.findAll();
        for (User u : users){
            System.out.println("User: "+u.getId()+" "+u.getNip());
        }
        return users.stream().map(u->mapper.map(u,UserDto.class)).collect(Collectors.toList());
    }

}
