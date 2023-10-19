/**
 * Author: Dennis Wang
 * Last modified data: 2023-10-19
 * Description: store files locally
 */

package com.example.it.project.service.Impl;

import com.example.it.project.service.IStorageService;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class StorageServiceImpl implements IStorageService {

    @Override
    public Boolean save(MultipartFile file, String fileName, String filePath) {
        String path = filePath + fileName;
        File targetFile = new File(path);
        // if no exists folder
        if (!targetFile.getParentFile().exists()){
            targetFile.getParentFile().mkdirs();
        }

        try {
            FileCopyUtils.copy(file.getBytes(), targetFile);
            return true;
        } catch (IOException e) {
        }
        return false;
    }
}