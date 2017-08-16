
package model;


public class DAO 
{
    public User exist(User u)
    { 
//        if(u.getMail().equalsIgnoreCase("diego-111-@gmail.com")&& u.getPass().equalsIgnoreCase("111222"))
//        {
//        return new User(u.getMail(),u.getPass(),"Diego Soto");
//        }
//        else
//        {
//         return null;
//        }
         if(u.getMail().equalsIgnoreCase("diego@mail.com"))
        {
          /*ok*/
            if(u.getPass().equalsIgnoreCase("123"))
            {
             /*ok*/
                return new User(u.getMail(),u.getPass(),"Diego Soto");
            }
            else
            {
             /*pass Incorrecta*/
                User newUser = new User(u.getMail(),u.getPass(),"Diego Soto");
                newUser.addError(new Error(1,"Pass Incorrecta"));
                return newUser;
            }
        }
        else
        {
          /*Email Erroneo*/
            User newUser = new User(u.getMail(),u.getPass(),"Diego Soto");
                newUser.addError(new Error(2,"Email Incorrecto"));
                return newUser;
        }
        
        
    }

}
