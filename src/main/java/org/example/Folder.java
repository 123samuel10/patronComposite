package org.example;

import org.example.service.FileComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String name;  // Nombre de la carpeta
    private List<FileComponent> components = new ArrayList<>();  // Lista de archivos y carpetas dentro de la carpeta

    public Folder(String name) {
        this.name = name;
    }

    /**
     * Agrega un archivo o carpeta a esta carpeta.
     * @param component Un archivo o carpeta para agregar.
     */
    public void add(FileComponent component) {
        components.add(component);
    }

    /**
     * Elimina un archivo o carpeta de esta carpeta.
     * @param component Un archivo o carpeta para eliminar.
     */
    public void remove(FileComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);  // Imprime el nombre de la carpeta
        for (FileComponent component : components) {
            component.showDetails();  // Llama a showDetails() en cada archivo o carpeta
        }
    }
}