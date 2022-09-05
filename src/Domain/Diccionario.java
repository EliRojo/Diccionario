package Domain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Diccionario {
    private String idioma;


    /*   La interfaz Set define una colección que no puede contener elementos duplicados.
     Esta interfaz contiene, únicamente, los métodos heredados de Collection añadiendo
     la restricción de que los elementos duplicados están prohibidos.
     Es importante destacar que, para comprobar si los elementos son elementos duplicados
     o no lo son, es necesario que dichos elementos tengan implementada,
     de forma correcta, los métodos equals y hashCode.
     Para comprobar si dos Set son iguales,
     se comprobarán si todos los elementos que
     los componen son iguales sin importar en el orden que ocupen dichos elementos  */
    private Set<Palabra> palabras;

    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.palabras = new TreeSet<>();

    }

    public String getIdioma() {
        return idioma;
    }

    public void regristrarPalabara(Palabra palabra) {
        palabras.add(palabra);
    }
    public void buscarPalabra (String palabra){
        //convierte el string palabra en un objeto de la clase Palabra//
        //para poder compararlo con los objetos de la coleccion//
        Palabra palabraBuscar = new Palabra(palabra);
        boolean seEncontro = false;
        for (Palabra palabraDiccionario: palabras) {
                 if (palabraDiccionario.getPalabra().equals(palabra)){
                    System.out.println(palabraDiccionario);
                    seEncontro =true;
                    break;
              }
            }
            if (!seEncontro){
                System.out.println("La palabra no existe en el diccionario");
            }
    }
    public void removerPalabra(String palabra){
        Palabra palabraRemover = new Palabra(palabra);
        //el metodo remove devuelve un true si el objeto que
        //le paso por parametro lo encuentra en la coleccion y lo elimina//
        boolean seRemovio= palabras.remove(palabraRemover);
        if(seRemovio) {
            System.out.println(palabraRemover+ " "+"se removio la palabra");
        }
        else {
            System.out.println(palabraRemover+ " no existe en el diccionario" );
        }
    }
    public void imprimirPalabra(){
        for (Palabra palabra:palabras) {
            System.out.println(palabra.getPalabra());
        }
    }



}
