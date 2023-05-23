package _scripts;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Usuario
{
    private String fullName;
    private String userName;
    private String password;
    private boolean status;

    public Usuario( String fullName, String userName, String password )
    {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        status = true;

        System.out.println("Usuario "+this.userName+" creado");
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void deleteUser()
    {
        status = false;
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
