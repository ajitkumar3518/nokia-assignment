package com.nokia.file.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nokia.file.store.domain.entity.FileEntity;
@Repository
public interface FileStoreRepository extends JpaRepository<FileEntity, String>{

}
