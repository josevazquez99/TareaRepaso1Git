package com.example.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String rutaFichero = "C:\\Users\\javazquez\\Desktop\\Entorno Servidor\\demo\\tarea1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}