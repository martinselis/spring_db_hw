package com.codeclan.example.one_to_many;

import com.codeclan.example.one_to_many.models.File;
import com.codeclan.example.one_to_many.models.Folder;
import com.codeclan.example.one_to_many.models.User;
import com.codeclan.example.one_to_many.repositories.FileRepository;
import com.codeclan.example.one_to_many.repositories.FolderRepository;
import com.codeclan.example.one_to_many.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyApplicationTests {

	@Autowired
	FileRepository fileRepo;

	@Autowired
	FolderRepository folderRepo;

	@Autowired
	UserRepository userRepo;

	@Test
	public void contextLoads() {

	}

	@Test
	public void createFileAndFolderAndUser() {
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
