package com.example.wishlistmanagement.service;


import com.example.wishlistmanagement.entity.WishlistItem;
import com.example.wishlistmanagement.repository.WishlistItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {
    @Autowired
    private WishlistItemRepository wishlistItemRepository;

    public List<WishlistItem> getUserWishlist(Long userId) {
        // implement logic to retrieve wishlist items for a user
        // you can use userId to filter items
        return wishlistItemRepository.findAll();
    }

    // implement methods to add/delete wishlist items as needed
}
