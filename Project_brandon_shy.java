import java.util.*;
import java.io.*;

public class Project_brandon_shy{

   public static void main(String[] args){
   
   try {
   File file = new File("PolicyInfo");
   
   Scanner keyboard = new Scanner(file); 
   
      int policyNumber,
          holderAge,
          s = 0,
          n = 0,
          objectCount = 0;
          
      String holderFirstName,
             holderLastName,
             smokingStatus,
             providerName;
             
      double holderHeight,
             holderWeight,
             holderBMI,
             totalPrice;
             
      ArrayList<Policy> policies = new ArrayList<Policy>(); 
      
      while (keyboard.hasNext()) {
      
      policyNumber = keyboard.nextInt();
      providerName = keyboard.next(); 
      keyboard.nextLine();
      holderFirstName = keyboard.nextLine();
      holderLastName = keyboard.next(); 
      keyboard.nextLine();  
      holderAge = Integer.parseInt(keyboard.nextLine());
      smokingStatus = keyboard.nextLine();
      if (smokingStatus.toLowerCase().charAt(0) == 's'){
         s++;
      }
      else{
         n++;
      }

      holderHeight = keyboard.nextDouble();
      holderWeight = keyboard.nextDouble();
      
      if (keyboard.hasNext())
            { 
               keyboard.nextLine();
               keyboard.nextLine();
            }
         

      
      PolicyHolder holder = new PolicyHolder(holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
      Policy policy = new Policy(policyNumber, providerName, holder);
      objectCount = policy.getInstancePolicy();
      policies.add(policy);
      }
      
      keyboard.close();
      
           
      for (int i = 0; i < policies.size(); i++) {
      
      policies.get(i).toString();
      policies.get(i).getPolicyHolder().toString();
       
      
                 }       
         System.out.println("There were " + objectCount + " Policy objects created.");
         System.out.println("The number of policies with a smoker is: " + s);
         System.out.println("The number of policies with a non-smoker is: " + n);
      }
     
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

   }
}