package _scripts;

import java.util.ArrayList;

public class Pizarra {

    private ArrayList<Anuncio> allAnuncios = new ArrayList<Anuncio>();

    public static void main(String[] args)
    {
        Anuncio anuncio = new Anuncio( "Test", "Esto es un cuerpo de mensaje" );
        Anuncio anuncio1 = new Anuncio( "Test1", "Esto es un cuerpo de mensaje1" );
    }
}