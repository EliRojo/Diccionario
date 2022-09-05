package Domain;

import java.util.Objects;

public class Palabra implements Comparable<Palabra>{
    protected String palabra;
    protected String significado;
    protected String idioma;

    public Palabra(String palabra, String significado, String idioma) {
        this.palabra = palabra;
        this.significado = significado;
        this.idioma = idioma;
    }

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getIdioma() {
        return idioma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //compara si esa instancia es del mismo objeto de la super clase//
        //no retorna false, porque es hija de la clase Palabra//
        if (o == null || !(o instanceof Palabra)) return false;
        //lo trata como un objeto de clase Palabra//
        Palabra palabra1 = (Palabra) o;
        return palabra.equals( palabra1.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra);
    }

    @Override
    public String toString() {
        return palabra +": "+significado;
    }

    @Override
    public int compareTo(Palabra o) {
        //el objeto palabra lo compara con el objeto que le llega por parametro//
        //contra el objeto que estamos agregando a la coleccion//
        //para poder darle un orden lógico, en este  caso lo ordena alfabeticamente.//
        return this.palabra.compareTo(o.getPalabra());
    }
}
