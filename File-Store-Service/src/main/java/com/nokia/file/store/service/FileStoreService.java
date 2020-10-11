package com.nokia.file.store.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.nokia.file.store.domain.entity.FileEntity;
import com.nokia.file.store.repository.FileStoreRepository;

@Service
public class FileStoreService {

	@Autowired
	FileStoreRepository fileStoreRepository;

	public FileEntity store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileEntity FileDB = new FileEntity(fileName, file.getContentType(), file.getBytes());

		return fileStoreRepository.save(FileDB);
	}

	public FileEntity getFile(String id) {
		return fileStoreRepository.findById(id).get();
	}

	public Stream<FileEntity> getAllFiles() {
		return fileStoreRepository.findAll().stream();
	}
}
