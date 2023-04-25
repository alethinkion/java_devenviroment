package _scripts;

import java.util.*;

public class Menu {

    private int userOption;
    private Pizarra currentPizarra;

    public Menu()
    {
        currentPizarra = new Pizarra();
    }

    public void showMainMenu()
    {
        System.out.println("1)Manejo de usuarios");
        System.out.println("2)Manejo de anuncios");
        System.out.println("3)Salir");

        selectOptionMainMenu();
    }

    private void showUserMenu()
    {
        System.out.println("1)Crear Usuario");
        System.out.println("2)Cambiar usuario");
        System.out.println("3)Editar usuario");
        System.out.println("4)Borrar usuario");
        System.out.println("5)Salir");

        selectOptionUserMenu();
    }

    private void showAnnouncementMenu()
    {
        System.out.println("1)Listar anuncios");
        System.out.println("2)Mostrar detalle");
        System.out.println("3)Crear anuncio");
        System.out.println("4)Editar anuncio");
        System.out.println("5)Eliminar anuncio");
        System.out.println("6)Salir");

        selectOptionUserMenu();
    }

    private void selectOptionMainMenu()
    {
        Scanner inputData = new Scanner (System.in);

        userOption = inputData.nextInt();

        resolveOptionMainMenu();
    }

    private void selectOptionUserMenu()
    {
        Scanner inputData = new Scanner (System.in);

        userOption = inputData.nextInt();

        resolveOptionUserMenu();
    }

    private void resolveOptionMainMenu()
    {
        showUserMenu();
        //switch( userOption ) {
        //    case 1:
        //        showUserMenu();
        //    break;
//
 //           case 2:
   //             //showAnnouncementMenu();
     //       break;
//
  //          case 3:
    //            currentPizarra.closePizarra();
      //      break;
        //}
    }

    private void resolveOptionUserMenu()
    {
        showMainMenu();
        /* 
        switch( userOption ) {
            case 1:
                currentPizarra.createNewUser();
                showUserMenu();
            break;

            case 2:
                currentPizarra.changeUser();
                showUserMenu();
            break;

            case 3:
                currentPizarra.editCurrentUser();
                showUserMenu();
            break;

            case 4:
                currentPizarra.disableUser();
                showUserMenu();
            break;

            case 5:
                showMainMenu();
            break;
        }
        */
    }

    private void selectOption()
    {
        Scanner inputData = new Scanner (System.in);

        userOption = inputData.nextInt();

        resolveOption();
    }

    private void resolveOption()
    {
        switch( userOption ) {
            case 1:
                Scanner inputData = new Scanner (System.in);

                String subjet;
                String body;

                System.out.println("Enter the subjet of anuncio");
                subjet = inputData.next();

                System.out.println("Enter the body of anuncio");
                body = inputData.next();
                
                currentPizarra.addAnuncio( subjet, body );
            break;

            case 2:
                currentPizarra.closePizarra();
            break;
        }
    }
}
