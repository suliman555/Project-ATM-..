
// Suliman Furaij Alatwi 
// ID / 391000596

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner input= new Scanner(System.in);
    User user=new User();
    operations o =new operations();
    
    String N= null ;
    String P = null ;
     
    int choice,draw,deposit,Transfer;
     
    
    System.out.println("    Welcome   ");
   System.out.println("-----------------------");
   
   while(user.login(N,P)){
    System.out.println("Enter your User name");
    N=input.next();
    System.out.println(" Enter your password   ");
    P=input.next();
    }
    
    
    do{
    System.out.println(" TransHistory.1 ");
    System.out.println(" Withdraw.2 ");
    System.out.println(" Deposit.3 ");
    System.out.println(" Transfer.4 ");
    System.out.println(" Adda new Account.5 ");
    System.out.println(" Quit.6 ");
    System.out.println(" choice from the list ");
    choice=input.nextInt();
    
     switch(choice){
         case 1:
            System.out.println("Your balance is"+o.getBalance());
        
            break;
         case 2:
             System.out.println("Enter the withdraw amount");
           
             draw=input.nextInt();
             System.out.println("Your balance is"+o.withDraw(draw));
             
             break;
         case 3:
             System.out.println("Enter the deposit amount");
             
             deposit=input.nextInt();
              
             System.out.println("Your balance is"+o.Deposit(deposit));
               
             break;
         case 4 :
             System.out.println("Enter the transfer amount ");
            
            Transfer=input.nextInt();
            
            System.out.println("Yoyr balance is "+o.Transfer(Transfer));
         
     }
    
System.out.println("**************************");
    
    }while(choice!=6);

  }
}