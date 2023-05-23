package _scripts.Pizarra;

import java.time.*;

public class Anuncio
{
    private String subject;
    private String body;
    private LocalDate date;
    private LocalTime time;
    private boolean isRead;
    private String owner;
    private boolean status;

    public Anuncio( String subject, String body, String nameUser )
    {
        this.subject = subject;
        this.body = body;
        date = LocalDate.now();
        time = LocalTime.now();
        owner = nameUser;
        status = true;
    }

    public void showSubject()
    {
        System.out.println( subject );
    }

    public void showBody()
    {
        System.out.println( body );
    }

    public void deleteAnuncio()
    {
        status = false;
    }
}

