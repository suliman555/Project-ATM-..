public class operations {
 
    
   private int balance;

    public operations() {
        this.balance = 20000;
    }

    public int getBalance() {
        return balance;
    }
      
     public int withDraw(int b){
     if(b>5000){
     
     System.out.println("You canot withdraw more than 5000");
     }else 
         balance-=b;
     return balance;
     
     
     }
    
     public int Deposit(int b){
     balance-=b;
     return balance;
     
     }
     public int Transfer(int b){
     balance-=b;
     
         return balance;
     }
     
     public int TransHistory(int b){
      
      return balance;
}


}   