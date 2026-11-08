package com.practica;

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        
        Stack<String> historial = new Stack<>();

        // Insertar elementos
        historial.push("google.com");
        historial.push("github.com");
        historial.push("stackoverflow.com");

        // Consultar el tope sin eliminarlo
        System.out.println("Página actual: " + historial.peek());

        // Retirar el elemento superior
        String paginaEliminada = historial.pop();
        System.out.println("Página retirada: " + paginaEliminada);

        // Consultar el nuevo tope
        System.out.println("Página anterior: " + historial.peek());

        // Consultar cantidad y estado
        System.out.println("Elementos: " + historial.size());
        System.out.println("¿Está vacía?: " + historial.empty());
    }
}