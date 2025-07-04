package net.romaric.filemanagement.service;

import net.romaric.filemanagement.entity.FileEntity;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    FileEntity storeFile(MultipartFile file, String description);
    Resource loadFileAsResource(String fileName);
    List<FileEntity> getAllFiles();
    FileEntity getFileById(Long id);
    void deleteFileById(Long id);
    List<FileEntity> searchFiles(String fileName);
}
