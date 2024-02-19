package com.example.wishlistmanagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.wishlistmanagement.entity.User;
import com.example.wishlistmanagement.entity.WishlistItem;
import com.example.wishlistmanagement.service.UserService;
import com.example.wishlistmanagement.service.WishlistService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private WishlistService wishlistService;

    @PostMapping("/signup")
    public User signUp(@RequestBody User user) {
        return userService.createUser(user);
    }

    // implement login endpoint

    @GetMapping("/wishlists")
    public List<WishlistItem> getUserWishlist(/* add authentication parameter */) {
        // retrieve user ID from authentication
        Long userId = 1L; // example user ID, replace with actual ID from authentication
        return wishlistService.getUserWishlist(userId);
    }

    // implement endpoints to add/delete wishlist items
}
