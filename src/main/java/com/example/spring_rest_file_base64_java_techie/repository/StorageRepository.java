package com.example.spring_rest_file_base64_java_techie.repository;

import com.example.spring_rest_file_base64_java_techie.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {
    Optional<ImageData> findByName(String fileName);
}
