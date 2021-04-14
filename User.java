 public class User {
    
     String name;
     String password;
    
     
    
    public User()
    {
        this.name = "Ahmed";
        this.password = "12345"; 
    
    

    }

   
      public boolean login(String N ,String P)
      {
      if(name.equals(N) && password.equals(P)){
         System.out.println("    WELCOME   ");
          return false;
      } else{
        
          return true; 
      }
          }
          
     } 