package io.reflectoring.demo.serivce;

import io.reflectoring.demo.dto.request.UserRequest;
import io.reflectoring.demo.entity.User;
import io.reflectoring.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User CreateRequest(UserRequest request){
        User user = new User();

        user.setEmail(request.getEmail());
        user.setName(request.getName());

        return userRepository.save(user);
    }
}
