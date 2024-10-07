package org.example;

import org.example.service.FileComponent;

public class File implements FileComponent {
    private String name;  // Nombre del archivo

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);  // Imprime el nombre del archivo
    }
}