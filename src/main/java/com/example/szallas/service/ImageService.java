package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Image;
import com.example.szallas.repository.AccomodationRepository;
import com.example.szallas.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class ImageService {
    private final ImageRepository imageRepository;
    private final AccomodationRepository accomodationRepository;

    public ImageService(ImageRepository imageRepository, AccomodationRepository accomodationRepository) {
        this.imageRepository = imageRepository;
        this.accomodationRepository = accomodationRepository;
    }

    public String uploadImage(MultipartFile img, Integer accomodation) throws FileNotFoundException {
        if(img.isEmpty()){
            throw new FileNotFoundException("A feltöltendő fájl üres.");
        }
        try {
            Accomodation accomodation1 = accomodationRepository.findById(accomodation).orElse(null);
            if(accomodation1 != null){
                Image image = new Image();
                image.setImage(img.getBytes());
                image.setAccomodation(accomodation1);
                imageRepository.save(image);
                return img.getOriginalFilename();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    public Image getImageById(Integer id) {
        return imageRepository.findById(id).orElse(null);
    }
}
