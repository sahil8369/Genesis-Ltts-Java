import java.util.*;
import java.util.Scanner;
 class TeamNameNotFoundException extends Exception{  
 TeamNameNotFoundException(String s){  
  super(s);  
 }  
}  
 class Iplteam{  
  
    static void validate()throws TeamNameNotFoundException{ 
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
       System.out.print("Enter the expected winner team of IPL Season 13");  
        String str= sc.nextLine();  

      System.out.print("Enter the expected runner Team of IPL Season 13 ");
      String ptr= sc.nextLine();  
  
       
     if((str=="Chennai Super Kings" || str=="Mumbai Indians" || str=="Sunrisers hydrebad" || str=="Royal challengers banglore" || 
         str=="Rajasthan royal" || str=="Punjab kings" || str=="kolkata knight riders" || str=="Delhi Capitals") && (ptr=="Chennai Super Kings" || ptr=="Mumbai Indians" || ptr=="Sunrisers hydrebad" || ptr=="Royal challengers banglore" || 
         ptr=="Rajasthan royal" || ptr=="Punjab kings" || ptr=="kolkata knight riders" || ptr=="Delhi Capitals") )
          
     { 
      System.out.println("Expected IPL Season 13 winner: "+ str + "\n"); 
      //throw new CustomException("InvalidAgeRangeException");  
    }
     else 
     { 
       throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
     }

     /*if(ptr=="Chennai Super Kings" || ptr=="Mumbai Indians" || ptr=="Sunrisers hydrebad" || ptr=="Royal challengers banglore" || 
         ptr=="Rajasthan royal" || ptr=="Punjab kings" || ptr=="kolkata knight riders" || ptr=="Delhi Capitals" )
          
     { 
      System.out.println("Expected IPL Season 13 runner: "+ ptr + "\n"); 
      //throw new CustomException("InvalidAgeRangeException");  
    }
     else 
     { 
       throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
     }*/


   }  
     
   public static void main(String args[]){  
      try{  
        
         validate();  
      }
      catch(Exception m)
      {
        System.out.println("Exception occured: "+m);
      }  
     }
     
  }  