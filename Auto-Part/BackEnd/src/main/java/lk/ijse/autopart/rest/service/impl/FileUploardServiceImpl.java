package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.service.FileUploardService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class FileUploardServiceImpl implements FileUploardService {


    @Override
    public boolean singleFileUpload(MultipartFile file) {

        if (!file.getOriginalFilename().isEmpty()) {
            BufferedOutputStream outputStream = null;
            try {
                outputStream = new BufferedOutputStream(
                        new FileOutputStream(
                                new File("E:/3rd sem ABSD project/AutoPart/Auto-Part/FrontEnd/Seller/src/assets/images/gig/", file.getOriginalFilename())));

                String path="http://localhost:8080/api/v1/fileUploard/file?file=E:/3rd sem ABSD project/AutoPart/Auto-Part/FrontEnd/Seller/src/assets/images/gig/"+file.getOriginalFilename();
                outputStream.write(file.getBytes());
                outputStream.flush();
                outputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return true;
    }


}
