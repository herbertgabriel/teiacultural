package com.proarecife.teiacultural.service;

import com.proarecife.teiacultural.entity.User;
import com.proarecife.teiacultural.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public void delete(Long id) {
        User user = new User();
        user.setId(id);
        userRepository.delete(user);
    }

    public User update(Long id, User user) {
        if (userRepository.existsById(id)) {
            User userFound = findById(id);
            return userRepository.save(user);
        }
        return null;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}