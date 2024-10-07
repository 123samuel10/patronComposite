package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear archivos individuales
        File file1 = new File("Document.txt");
        File file2 = new File("Image1.png");
        File file3 = new File("Image2.png");

        // Crear carpetas
        Folder folder1 = new Folder("Root");
        Folder folder2 = new Folder("Images");

        // Agregar archivos a la carpeta 'Images'
        folder2.add(file2);
        folder2.add(file3);

        // Agregar archivos y carpetas a la carpeta 'Root'
        folder1.add(file1);
        folder1.add(folder2);

        // Mostrar los detalles de la estructura de archivos
        folder1.showDetails();
    }
}