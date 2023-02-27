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
          n = 0;
          
      String holderFirstName,
             holderLastName,
             smokingStatus,
             providerName;
             
      double holderHeight,
             holderWeight,
             holderBMI,
             totalPrice;
             
      ArrayList<Policy> holders = new ArrayList<Policy>(); 
      
      while (keyboard.hasNext()) {
      
      policyNumber = keyboard.nextInt();
      providerName = keyboard.next(); 
      keyboard.nextLine();
      holderFirstName = keyboard.nextLine();
      holderLastName = keyboard.next(); 
      keyboard.nextLine();  
      holderAge = Integer.parseInt(keyboard.nextLine());
      smokingStatus = keyboard.nextLine();
      holderHeight = keyboard.nextDouble();
      holderWeight = keyboard.nextDouble();
      
      if (keyboard.hasNext())
            { 
               keyboard.nextLine();
               keyboard.nextLine();
            }
         

      
      Policy holder = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
      
      holders.add(holder);
      }
      
      keyboard.close();
      
      /**
      holderBMI = policyHolder1.calcBMI(holderHeight, holderWeight);
      
      totalPrice = policyHolder1.calcPolicyPrice(holderAge, smokingStatus, holderBMI);
       */  
      
      for (int i = 0; i < holders.size(); i++) {
         System.out.println();
         System.out.println("Policy Number: " + holders.get(i).getPolicyNumber());
         System.out.println("Provider Name: " + holders.get(i).getProviderName());
         System.out.println("Policyholder's First Name: " + holders.get(i).getHolderFirstName());
         System.out.println("Policyholder's Last Name: " + holders.get(i).getHolderLastName());
         System.out.println("Policyholder's Age: " + holders.get(i).getHolderAge());
         System.out.println("Policyholder's Smoking Status: " + holders.get(i).getSmokingStatus());
         System.out.printf("Policyholder's Height: %.2f inches\n", holders.get(i).getHolderHeight());
         System.out.printf("Policyholder's Weight: %.2f pounds\n", holders.get(i).getHolderWeight());
         System.out.printf("Policyholder's BMI: %.2f\n", holders.get(i).calcBMI());
         System.out.printf("Policy Price:  $%.2f", holders.get(i).calcPolicyPrice(holders.get(i).calcBMI() ));
         
              }
      
           }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

   }
}