package com.codeclan.example.one_to_many.repositories;

import com.codeclan.example.one_to_many.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
