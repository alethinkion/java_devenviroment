package _scripts;

import java.time.LocalDate;
import java.time.LocalTime;

public class Anuncio
{
    private String subject;
    private String body;
    private LocalDate date;
    private LocalTime time;
    private boolean isRead;
    private boolean status;

    public Anuncio( String subject, String body )
    {
        this.subject = subject;
        this.body = body;
        date = LocalDate.now();
        time = LocalTime.now();
        isRead = false;
        status = true;
    }

    public void showSubject()
    {
        System.out.println( subject );
    }

    public void showBody()
    {
        System.out.println( body );

        isRead = true;
    }

    public void deleteAnuncio()
    {
        status = false;

        System.out.println("Anuncio borrado");
    }

    public void editUser( String editFullName, String editUserName, String editPassword )
    {
        if( editFullName != null )
        {
            fullName = editFullName;
        }
        if( editUserName != null )
        {
            userName = editUserName;
        }
        if( editPassword != null )
        {
            password = editPassword;
        }
    }
}

