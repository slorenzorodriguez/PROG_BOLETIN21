/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Libro {
      private String titulo;
    private String autor;
    private String isbn;
    private float precio;
    private int stock;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn10(isbn);
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static String isbn10(String isbn) {
        String lastDigit;
        int checksum = 0;
        int[] d = new int[9];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(String.valueOf(isbn.charAt(i)));
            checksum = checksum + (d[i] * (i + 1));
        }
        checksum %= 11;
        lastDigit = checksum < 10 ? String.valueOf(checksum) : "X";
        return isbn + lastDigit;
    }

    public static Libro nuevoLibro() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce titulo: ");
        String titulo = scan.nextLine();
        System.out.print("Introduce autor: ");
        String autor = scan.nextLine();
        System.out.print("Introduce ISBN *Código de 9 cifras*: ");
        String isbn = scan.next();
        System.out.print("Introduce precio: ");
        float precio = scan.nextFloat();
        System.out.print("Introduce cantidad: ");
        int stock = scan.nextInt();

        return new Libro(titulo, autor, isbn, precio, stock);
    }

    public void mostrarLibro() {
        System.out.println(toString());
    }

    public boolean venderLibro() {
        if (stock > 0) {
            stock--;
            System.out.println("Libro " + titulo + " vendido; en stock " + ((stock == 1) ? " " : "n ") + stock);
            return true;
        }
        System.out.println("Libro no disponible en stock");
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
