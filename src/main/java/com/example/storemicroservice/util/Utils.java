package com.example.storemicroservice.util;

import com.example.storemicroservice.domain.Store;
import com.example.storemicroservice.exception.ResourceNotFoundException;
import com.example.storemicroservice.repository.StoreRepository;
import org.springframework.stereotype.Component;

@Component
public class Utils {

    public Store findAnimeOrThrowNotFound(Long id, StoreRepository storeRepository) {
        return storeRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Store Not Found"));
    }
}
