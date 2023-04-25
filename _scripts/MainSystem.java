//TODO: agregar que usuario y anuncio sea una base de datos, en un txt, crear clases par manejar ada uno.
//      Crear clase system que arranca todas las claes, deberia reemplazar al codigo de main.

package _scripts;

public class MainSystem
{
    public static void main(String[] args)
    {
        Menu menu = new Menu();

        do 
        {
            menu.showMainMenu();
        }while( true );
    }
}
