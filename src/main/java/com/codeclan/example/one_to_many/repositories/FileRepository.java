package com.codeclan.example.one_to_many.repositories;

import com.codeclan.example.one_to_many.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

}
