//TODO: agregar que usuario y anuncio sea una base de datos, en un txt, crear clases par manejar ada uno.
//      Crear clase system que arranca todas las claes, deberia reemplazar al codigo de main.

package _scripts;

import java.util.*;

public class Pizarra {

    private ArrayList<Anuncio> allAnuncios;

    public Pizarra()
    {
        allAnuncios = new ArrayList<Anuncio>();
    }

    public void addAnuncio()
    {
        Scanner inputData = new Scanner (System.in);
        String subjet;
        String body;

        System.out.println("Enter the subjet of anuncio");
        subjet = inputData.next();

        System.out.println("Enter the body of anuncio");
        body = inputData.next();

        Anuncio newAnuncio = new Anuncio( subjet, body );
        allAnuncios.add( newAnuncio );
    }

    public void listAllSubjet( Pizarra currentpizarra )
    {
        allAnuncios.forEach( System.out::println );
    }

    public static void main(String[] args)
    {
        Pizarra pizarra = new Pizarra();
        boolean isLoading = true;

        System.out.println("");
        while( isLoading )
        {

        }
        pizarra.addAnuncio();

        pizarra.listAllSubjet( pizarra );
    }
}