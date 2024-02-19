package com.example.wishlistmanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.wishlistmanagement.entity.User;
import com.example.wishlistmanagement.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        // implement user creation logic, e.g., encrypt password before saving
        return userRepository.save(user);
    }

    // implement other user-related methods as needed
}
