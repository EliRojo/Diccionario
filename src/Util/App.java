package Util;

import Domain.Diccionario;
import Domain.Palabra;
import Domain.PalabraOtroIdioma;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String []args){
        Diccionario diccionario = new Diccionario("español");
        diccionario.regristrarPalabara(new Palabra("abeja","insecto","español"));
        diccionario.regristrarPalabara(new Palabra("programacion","accion de programar","español"));
        diccionario.buscarPalabra("abeja");
        diccionario.buscarPalabra("manteca");
        diccionario.removerPalabra("programacion");
        diccionario.imprimirPalabra();

        Diccionario diccionarioIngles = new Diccionario("Inglés");
        diccionarioIngles.regristrarPalabara(new PalabraOtroIdioma("Programming",
                "the process or activity of writing computer programs.", "Inglés", "Programming"));
        diccionarioIngles.regristrarPalabara(new PalabraOtroIdioma("Bee",
                "An insect of a large group to which the honeybee belongs, including many solitary as well as social kinds.", "Inglés", "bi"));
        diccionarioIngles.regristrarPalabara(new PalabraOtroIdioma("Greeting",
                "The action of giving a sign of welcome.", "Inglés", "gritin"));
        diccionarioIngles.regristrarPalabara(new PalabraOtroIdioma("Programming",
                "the process or activity of writing computer programs.", "Inglés", "Programming"));
        diccionarioIngles.regristrarPalabara(new PalabraOtroIdioma("Apple",
                "the round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh.", "Inglés", "apel"));

        diccionarioIngles.buscarPalabra("Programming");
        diccionarioIngles.imprimirPalabra();
        diccionarioIngles.removerPalabra("Programming");
        System.out.println("Diccionario después de remover");
        diccionarioIngles.imprimirPalabra();





    }
}
