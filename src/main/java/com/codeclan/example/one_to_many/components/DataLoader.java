package com.codeclan.example.one_to_many.components;

import com.codeclan.example.one_to_many.models.File;
import com.codeclan.example.one_to_many.models.Folder;
import com.codeclan.example.one_to_many.models.User;
import com.codeclan.example.one_to_many.repositories.FileRepository;
import com.codeclan.example.one_to_many.repositories.FolderRepository;
import com.codeclan.example.one_to_many.repositories.UserRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepo;

    @Autowired
    FolderRepository folderRepo;

    @Autowired
    UserRepository userRepo;

    public void run(ApplicationArguments args) {
        User user1 = new User("Joe");
        userRepo.save(user1);

        Folder folder1 = new Folder("images", user1);
        folderRepo.save(folder1);

        File file1 = new File("Image", "jpeg", 2.0, folder1);
        fileRepo.save(file1);

        folder1.addFile(file1);
        folderRepo.save(folder1);
    }
}
