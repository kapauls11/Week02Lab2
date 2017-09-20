package sait.cprg352;

/**
 *
 * @author 698437
 */
public class UserService {
    
    private String[] usernames = {"adam", "betty", "Betty","Adam"};
    private String password = "password";
    
    	public boolean login(String username, String password){
            
        boolean loginValid = false;
        
       for(String user : usernames){
            if(user.equals(username))
                if(this.password.equals(password))
                loginValid = true;
                
            }
        return loginValid;
            
       }

   }

