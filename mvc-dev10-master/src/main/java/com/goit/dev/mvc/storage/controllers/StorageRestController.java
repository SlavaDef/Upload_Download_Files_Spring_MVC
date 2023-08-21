package com.goit.dev.mvc.storage.controllers;

import com.goit.dev.mvc.storage.service.StorageService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@RestController // сервіс який повертає нам обьекти у формати json, xml...
@RequestMapping("/rest") // ніби корень нашого запиту
public class StorageRestController {

    private StorageService storageService;

    public StorageRestController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/all") // повернеться весь список файлів
    public List<Path> getAllFiles() {
        return storageService.loadAll().collect(Collectors.toList());
    }

    @GetMapping("/{filename}") // повернення окремого файлу
    public void getFile(@PathParam("filename") String filename) {

    }

    @DeleteMapping("/{filename}") // видалення якогось конкретного файлу
    public void deleteFile(@PathParam("filename") String filename) { // приймаємо змінну
    }

    @PostMapping("/")
    public List<Path> createFile() {
        return storageService.loadAll().collect(Collectors.toList());
    }


    @PutMapping("/{filename}")
    public void updateFile(){
    }
}
