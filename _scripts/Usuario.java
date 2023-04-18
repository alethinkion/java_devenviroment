package _scripts;

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
    }

    public void deleteUser( String deleteUserName )
    {
        status = false;
        
        System.out.println("Usuario "+deleteUserName+" eleminado");
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
