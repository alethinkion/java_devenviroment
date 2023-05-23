package _scripts.Pizarra;

import java.util.*;

public class Pizarra {

    private ArrayList<Anuncio> allAnuncios;
    private ArrayList<Usuario> allUsuarios;
    private Usuario currentUser;
    private boolean status;

    public Pizarra()
    {
        allAnuncios =   new ArrayList<Anuncio>();
        allUsuarios =   new ArrayList<Usuario>();
        status =        true;
    }

    public void createNewUser()
    {
        Scanner inputData = new Scanner (System.in);
        String fullName;
        String userName;
        String password;
        boolean result = true;

        do
        {    
            System.out.println("Enter the fullname for new user:");
            fullName = inputData.next();
    
            System.out.println("Enter the username for new user:");
            userName = inputData.next();
            
            System.out.println("Enter the password for new user:");
            password = inputData.next();
    
            for(Usuario usuario : allUsuarios)
            {
                if( userName == usuario.getUserName() )
                {
                    result = false;
                    break;
                }
            }
        }while( !result );

        Usuario newUser = new Usuario( fullName, userName, password );
        allUsuarios.add( newUser );

        System.out.println("Created user "+userName);
    }

    public void changeUser()
    {
        Scanner inputData = new Scanner (System.in);
        Usuario resultUser;
        String userName;
        String password;
        boolean result = false;

        do
        {
            String compareData;

            System.out.println("Enter the username to change:");
            userName = inputData.next();
    
            System.out.println("Enter the password to change:");
            password = inputData.next();

            compareData = userName+password;

            for(Usuario usuario : allUsuarios)
            {
                String tempUserData = usuario.getUserName()+usuario.getPassword();

                if( compareData == tempUserData )
                {
                    result = true;
                    resultUser = usuario;
                    break;
                }
            }
        }while( !result );

        currentUser = resultUser;
        System.out.println("Changed to user "+userName);
    }

    public void editCurrentUser()
    {
        Scanner inputData = new Scanner (System.in);
        String changeFullName;
        String changeUserName;
        String changePassword;

        System.out.println("Enter the fullname for change:");
        changeFullName = inputData.next();

        System.out.println("Enter the username for change:");
        changeUserName = inputData.next();
        
        System.out.println("Enter the password for change:");
        changePassword = inputData.next();

        currentUser.editUser( changeFullName, changeUserName, changePassword );
        System.out.println( "Value change for"+currentUser.getUserName() );
    }

    public void disableUser()
    {
        currentUser.deleteUser();
        System.out.println( "Disable user "+currentUser.getUserName() );
    }

    public void listAllSubjet()
    {
        if( allAnuncios.isEmpty() )
        {
            System.out.println("Bandeja de anuncios vacia");
            return;
        }

        //allAnuncios.forEach( (anuncio) -> {
        //    if( anuncio. )
        //    anuncio.showSubject() );
    }

    public void addAnuncio( String subjet, String body )
    {
        //Anuncio newAnuncio = new Anuncio( subjet, body );
        //allAnuncios.add( newAnuncio );
    }

    public void closePizarra()
    {
        status = false;
    }

    public boolean statusPizarra()
    {
        return status;
    }
}