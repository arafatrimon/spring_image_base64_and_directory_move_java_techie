package com.example.spring_rest_file_base64_java_techie.repository;

import com.example.spring_rest_file_base64_java_techie.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData,Long> {
    Optional<FileData> findByName(String fileName);
}
