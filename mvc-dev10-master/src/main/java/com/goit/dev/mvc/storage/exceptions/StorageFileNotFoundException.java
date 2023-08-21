package com.goit.dev.mvc.storage.exceptions;

public class StorageFileNotFoundException extends RuntimeException {

    // робимо власний ексепшен, екстендемо RuntimeException і юзаємо конструктори з
   //  одним і двома параметрами конструктори стандарт
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
