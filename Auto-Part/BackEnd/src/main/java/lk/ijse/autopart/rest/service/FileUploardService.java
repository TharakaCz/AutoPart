package lk.ijse.autopart.rest.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploardService {

    public boolean singleFileUpload( MultipartFile file);

//    public MultipartFile getFile(MultipartFile file);
}
